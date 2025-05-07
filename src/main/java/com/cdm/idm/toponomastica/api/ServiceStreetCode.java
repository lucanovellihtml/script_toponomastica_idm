package com.cdm.idm.toponomastica.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.ArrayOfTopoServiceTypeGetVieFTopoStreet;
import com.cdm.idm.toponomastica.api.soap.org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetVieFTopoStreet;
import com.cdm.idm.toponomastica.api.soap.org.tempuri.ObjectFactory;
import com.cdm.idm.toponomastica.api.soap.org.tempuri.SitGetVieFTopo;
import com.cdm.idm.toponomastica.api.soap.org.tempuri.Toponomastica45;
import com.cdm.idm.toponomastica.api.soap.org.tempuri.Toponomastica45PortType;
import com.cdm.idm.toponomastica.database.DbResidenceCheck;
import com.cdm.idm.toponomastica.user.User;
import com.cdm.idm.toponomastica.util.ConstantToponomastica;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;

public class ServiceStreetCode {

    public void getServiceStreetCode(String pToponomy, String pType) {

        SitGetVieFTopo requestVieFTopo = new SitGetVieFTopo();
        ObjectFactory objectFactory = new ObjectFactory();

        try {

            Toponomastica45 service = new Toponomastica45();

            Toponomastica45PortType port = service.getToponomastica45HttpsSoap11Endpoint();

            // Creazione della mappatura per i campi headers
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("Authorization", List.of("Bearer 9d32b91c-20c8-3e40-979b-595a3b267066"));

            /*
             * Creazione dell'oggetto per accedere al servizio del wsdl.
             * Questo servizio ha bisogno del token nell'header.
             */
            BindingProvider bindingProvider = (BindingProvider) port;
            bindingProvider.getRequestContext().put(
                    MessageContext.HTTP_REQUEST_HEADERS, headers);

            /*
             * Attraverso il metodo "sitGetVieFTopo" andiamo a richiamare il servizio.
             * Andiamo a impostare i parametri dell'utente recuperati dalla query sul db.
             * Attraverso il metodo "getStreet" otteniamo la response filtratta all'odonimo
             * XML <Street>.
             */
            JAXBElement<ArrayOfTopoServiceTypeGetVieFTopoStreet> response = port.sitGetVieFTopo(
                    ConstantToponomastica.PTOKEN,
                    "mercantini luigi",
                    "via").getStreet();

            /*
             * Dalla response otteniamo il valore degli odonomi trovati e creiamo l'array
             * dei valori.
             * Attraverso il metodo getTopoServiceTypeGetVieFTopoStreet recuperiamo la lista
             * dei singoli campi dettagliati.
             */
            ArrayOfTopoServiceTypeGetVieFTopoStreet arrayValueStreet = response.getValue();
            List<TopoServiceTypeGetVieFTopoStreet> listValueStreet = arrayValueStreet
                    .getTopoServiceTypeGetVieFTopoStreet();

            /*
             * Controlliamo se la lista sia vuota.
             * In caso di lista valorizzata, salviamo il valore <StateCode> e <StreetCode>.
             */
            if (!listValueStreet.isEmpty()) {

                for (TopoServiceTypeGetVieFTopoStreet street : listValueStreet) {
                    System.out.println("OGGETTO ---> " + street.getStreetCode());
                }

            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void main(String[] args) {
        ServiceStreetCode prova = new ServiceStreetCode();
        prova.getServiceStreetCode(null, null);
    }

}
