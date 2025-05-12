package com.cdm.idm.toponomastica.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.datacontract.schemas._2004._07.wcftopo.ArrayOfTopoServiceTypeGetVieFTopoStreet;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetVieFTopoStreet;
import org.tempuri.Toponomastica45;
import org.tempuri.Toponomastica45PortType;
import com.cdm.idm.toponomastica.util.ConstantToponomastica;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

public class ServiceStreetCode {

    public Map<String, Integer> getServiceStreetCode(String pToponomy, String pType) {

        String method = "[getServiceStreetCode]::";

        Map<String, Integer> resultValueStreet = new HashMap<>();

        try {

            Toponomastica45 service = new Toponomastica45();

            Toponomastica45PortType port = service.getToponomastica45HttpsSoap11Endpoint();

            // Creazione della mappatura per i campi headers
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("Authorization", List.of(ConstantToponomastica.TOKENHEADER));

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
                    pToponomy,
                    pType).getStreet();

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
             * Viene controllato il campo <TopoVia> con l'input <pType> ---> questo
             * controllo serve in caso di piu' <Street> come risultato.
             * In caso di esito positivo, vengono mappati i valori trovati e fatto il break
             * del ciclo.
             */
            if (!listValueStreet.isEmpty()) {

                for (TopoServiceTypeGetVieFTopoStreet street : listValueStreet) {

                    if (street.getTopoVia().getValue().equalsIgnoreCase(pType)) {
                        resultValueStreet.put("streetcode", street.getStreetCode());
                        resultValueStreet.put("statuscode", street.getStateCode());
                        System.out.println(method + "Street Code = " + resultValueStreet.get("streetcode")
                                + " / Status Code = " + resultValueStreet
                                        .get("statuscode"));
                        break;
                    }

                }

            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return resultValueStreet;

    }

    public static void main(String[] args) {
        ServiceStreetCode prova = new ServiceStreetCode();
        prova.getServiceStreetCode("mercantini luigi", "via");
    }

}
