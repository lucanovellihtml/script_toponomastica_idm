package com.cdm.idm.toponomastica.util;

public class ConstantToponomastica {

    /*
     * Query per recuperare la lista dei cittadini che non hanno residenza a milano
     * ma ci abitano
     */
    public static String QUERY_ANAGRAFICA = "select username,ResidenceAddress from managed_user where (resident is null or resident='' || (resident in ('I','R','E'))) and residencemunicipality='Milano' AND cdmSIPOCheckedOn!='TO_CHECK'";

    // Informazioni per la connessione al database
    public static String IP = "localhost";
    public static String PORT = "5004";
    public static String USERNAME = "openidm";
    public static String PASSWORD = "!4dm1n1DM!";
    public static String NAME_DB = "openidm";

}
