package com.cdm.idm.toponomastica;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.cdm.idm.toponomastica.api.ServiceCivicCode;
import com.cdm.idm.toponomastica.api.ServiceStreetCode;
import com.cdm.idm.toponomastica.api.ServiceTypeVia;
import com.cdm.idm.toponomastica.database.DbResidenceCheck;
import com.cdm.idm.toponomastica.user.User;

public class AddressValidated {
    public static void main(String[] args) {

        /*
         * L'oggetto dbResidenceCheck gestisce l'apertura della connessione al database
         * e l'esecuzione della query.
         * Viene restituita una lista di oggetti User, dove i singoli campi dell'oggetto
         * saranno utilizzati come input per i servizi SOAP.
         */
        DbResidenceCheck dbResidenceCheck = new DbResidenceCheck();
        List<User> listRecordQuery = dbResidenceCheck.getUserDomiciledMilan();

        System.out.println("Records query restituiti = " + listRecordQuery.size());

        /*
         * Viene ciclato ogni singolo oggetto User della lista.
         * 
         * La regex permette di separare un stringa in base a:
         * - SPAZI VUOTI;
         * - CARATTERI SPECIALI;
         * - PUNTEGGIATURA(ESCLUSO PUNTO,APICE,SLASH);
         * 
         * Viene controllato se nello split esiste un oggetto solo numerico, questo
         * significa che si tratta di una strada con civico.
         * Se si tratta di una strada con civico allora è da analizzare, altrimenti
         * viene scartata.
         * Se si tratta di una strada da analizzare, vengono costruiti i parametri
         * d'input da inserire nelle tre Api.
         * 
         */
        for (User singleUser : listRecordQuery) {

            String pType = null;
            String pCivic = null;
            String pToponomy = "";

            String[] split = singleUser.getResidenceAddress().split("[^\\w'./]+");
            for (int i = 0; i < split.length; i++) {

                if (StringUtils.isNumeric(split[i])) {
                    System.out.println(singleUser.toString());
                    pCivic = split[i];
                    pType = split[0];
                    pToponomy = singleUser.getResidenceAddress().replace(split[0], "").replace(pCivic, "")
                            .replace(",", "").trim();

                    /*
                     * Api sitGetTipoVIa.
                     * Servizio che verifica la valitidà dell'odonimo della street.
                     * In caso affermativo viene memorizzato il valore CODE e chiamata la seconda
                     * Api.
                     */
                    ServiceTypeVia serviceTypeVia = new ServiceTypeVia();
                    String codeValue = serviceTypeVia.getServiceTypeVia(pType);
                    if (StringUtils.isNotBlank(codeValue)) {
                        System.out.println("Odonimo valido, CODE = " + codeValue);

                        /*
                         * Api sitGetVieFTopo.
                         * Servizio che verifica la valitidà del nome della street.
                         * In caso affermativo viene memorizzato il valore STREETCODE e chiamata la
                         * terza Api.
                         */
                        ServiceStreetCode serviceStreetCode = new ServiceStreetCode();
                        Map<String, Integer> mapValueStreet = serviceStreetCode.getServiceStreetCode(pToponomy, pType);
                        if (!mapValueStreet.isEmpty()) {
                            Integer streetCode = mapValueStreet.get("streetcode");
                            Integer statusCode = mapValueStreet.get("statuscode");
                            System.out.println("Strada valida, STREETCODE = " + streetCode);

                            /*
                             * Api sitGetViaFCode.
                             * Servizio che verifica la valitidà della strada con il civico.
                             * In caso affermativo viene memorizzato il valore IDC, il TOPONYM e viene
                             * impostato il flag update dello user a true.
                             */
                            ServiceCivicCode serviceCivicCode = new ServiceCivicCode();
                            Map<String, String> mapValueCivic = serviceCivicCode.getServiceCivicCode(streetCode, pCivic,
                                    statusCode);

                            if (!mapValueCivic.isEmpty()) {
                                String toponym = mapValueCivic.get("toponym");
                                Integer idc = Integer.parseInt(mapValueCivic.get("idc"));
                                System.out.println("Strada con civico valida, IDC = " + idc);
                                singleUser.setIdc(idc);
                                singleUser.setResidenceAddressNew(toponym);
                                singleUser.setStreetCode(streetCode);
                                singleUser.setTypeViaCode(codeValue);
                                singleUser.setUpdateFlag(true);
                                System.out.println("Parametri dell'utente aggiornati...");
                                System.out.println(singleUser.toString() + "\n");
                            } else {
                                System.err.println("[sitGetViaFCode]::Strada con civico non valida...\n");
                            }
                        } else {
                            System.err.println("[sitGetVieFTopo]::Strada non valida...\n");
                        }
                    } else {
                        System.err.println("[sitGetTipoVia]::Odonimo non valido...\n");
                    }
                    break;
                }
            }
        }
    }
}