package com.cdm.idm.toponomastica.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.datacontract.schemas._2004._07.wcftopo.ArrayOfTopoServiceTypeGetCivicoTipoViaType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoTipoViaType;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetTipoVia;
import org.identityconnectors.common.logging.Log;
import org.tempuri.Toponomastica45;
import org.tempuri.Toponomastica45PortType;
import com.cdm.idm.toponomastica.util.ConstantToponomastica;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

public class ServiceTypeVia {

    // Log
    private static final Log log = Log.getLog(ServiceTypeVia.class);

    public String getServiceTypeVia(String pType) {

        String method = "[getServiceTypeVia]::";

        String resultCodeVie = null;

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
             * Attraverso il metodo "sitGetTipoVia" andiamo a richiamare il servizio.
             * Andiamo a impostare i parametri ottenuti dalla response del servizio
             * "sitGetViaFCode".
             * Attraverso il metodo "getType" otteniamo la response filtratta all'odonimo
             * XML <Type>.
             * Dalla response otteniamo il valore degli odonomi trovati e creiamo l'array
             * dei valori.
             */
            TopoServiceTypeGetTipoVia response = port.sitGetTipoVia(ConstantToponomastica.PTOKEN, pType);
            JAXBElement<ArrayOfTopoServiceTypeGetCivicoTipoViaType> arrayType = response.getType();

            /*
             * Attraverso il metodo getTopoServiceTypeGetCivicoTipoViaType recuperiamo la
             * lista dei singoli campi dettagliati.
             * Controlliamo se la lista sia vuota.
             * Cicliamo la lista e per ogni oggetto, controlliamo che l'input <pType>
             * coincida con il campo <DescriptionExtended>.
             * In caso di esito positivo, viene memorizzato il campo >Code>.
             */
            List<TopoServiceTypeGetCivicoTipoViaType> listTypeAddress = arrayType.getValue()
                    .getTopoServiceTypeGetCivicoTipoViaType();

            if (!listTypeAddress.isEmpty()) {

                for (TopoServiceTypeGetCivicoTipoViaType elementVia : listTypeAddress) {
                    if (elementVia.getDescriptionExtended().getValue().equalsIgnoreCase(pType)) {
                        resultCodeVie = elementVia.getCode().getValue();
                        log.info(method + "Code Address = " + resultCodeVie);
                    }
                }
            }

        } catch (Exception e) {
            log.error(method + e.getMessage());
        }

        return resultCodeVie;

    }

    public static void main(String[] args) {
        ServiceTypeVia prova = new ServiceTypeVia();
        prova.getServiceTypeVia("via");
    }

}
