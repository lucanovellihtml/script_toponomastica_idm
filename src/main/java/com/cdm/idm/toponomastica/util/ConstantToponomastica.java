package com.cdm.idm.toponomastica.util;

public class ConstantToponomastica {

    /*
     * Query per recuperare la lista dei cittadini che non hanno residenza a milano
     * ma ci abitano
     */
    public static String QUERY_ANAGRAFICA = "select username,ResidenceAddress from managed_user where (resident is null or resident='' || (resident in ('I','R','E'))) and residencemunicipality='Milano' AND cdmSIPOCheckedOn!='TO_CHECK'";

    // Informazioni per la connessione al database
    // public static String IP = "localhost";
    // public static String PORT = "5004";
    public static String IP = "172.16.229.4";
    public static String PORT = "5432";
    public static String USERNAME = "openidm";
    public static String PASSWORD = "!4dm1n1DM!";
    public static String NAME_DB = "openidm";
    public static String PREFIX_URL = "jdbc:postgresql://";

    // Parametri per le chiamate soap
    public static String PTOKEN = "54LTT512;";
    public static Integer PREFERENCE = 1;
    public static String TOKENHEADER = "Bearer 9d32b91c-20c8-3e40-979b-595a3b267066";

}
