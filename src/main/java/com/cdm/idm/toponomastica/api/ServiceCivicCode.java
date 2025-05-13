package com.cdm.idm.toponomastica.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.datacontract.schemas._2004._07.wcftopo.ArrayOfTopoServiceTypeGetViaFCodeCivic;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetViaFCode;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetViaFCodeCivic;
import org.identityconnectors.common.logging.Log;
import org.tempuri.Toponomastica45;
import org.tempuri.Toponomastica45PortType;
import com.cdm.idm.toponomastica.util.ConstantToponomastica;

import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

public class ServiceCivicCode {

    // Log
    private static final Log log = Log.getLog(ServiceCivicCode.class);

    public Map<String, String> getServiceCivicCode(Integer streetCodeValue, String streetNumberCivic,
            Integer streetStatusCode) {

        String method = "[getServiceCivicCode]::";

        Map<String, String> resultValueCivicCode = new HashMap<>();

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
             * Attraverso il metodo "sitGetVieFCode" andiamo a richiamare il servizio.
             * Andiamo a impostare i parametri ottenuti dalla precedente chiamata
             * "sitGetViaFTopo".
             * Attraverso il metodo "getCivic" otteniamo la response filtratta all'odonimo
             * XML <Civic>.
             */
            TopoServiceTypeGetViaFCode response = port.sitGetViaFCode(ConstantToponomastica.PTOKEN,
                    streetCodeValue,
                    streetNumberCivic,
                    streetStatusCode,
                    ConstantToponomastica.PREFERENCE);

            /*
             * Dalla response otteniamo il valore degli odonomi trovati e creiamo l'array
             * dei valori.
             * Attraverso il metodo getTopoServiceTypeGetViaFCodeCivic recuperiamo la lista
             * dei singoli campi dettagliati.
             */
            ArrayOfTopoServiceTypeGetViaFCodeCivic arrayValue = response.getCivic().getValue();
            List<TopoServiceTypeGetViaFCodeCivic> listValueCivic = arrayValue.getTopoServiceTypeGetViaFCodeCivic();

            /*
             * Controlliamo se la lista sia vuota.
             * In caso di lista valorizzata, salviamo il valore <IDC> e <Toponym>.
             * In caso di esito positivo, vengono mappati i valori trovati.
             */
            if (!listValueCivic.isEmpty()) {

                for (TopoServiceTypeGetViaFCodeCivic civicCode : listValueCivic) {
                    resultValueCivicCode.put("idc", String.valueOf(civicCode.getIDC()));
                    resultValueCivicCode.put("toponym", civicCode.getToponym().getValue());
                    log.info(method + "Idc = " + resultValueCivicCode.get("idc") + " / Toponym = "
                            + resultValueCivicCode.get("toponym"));
                }
            }

        } catch (Exception e) {
            log.error(method + e.getMessage());
        }

        return resultValueCivicCode;

    }

    public static void main(String[] args) {
        ServiceCivicCode prova = new ServiceCivicCode();
        prova.getServiceCivicCode(1247, "6", 2);
    }

}
