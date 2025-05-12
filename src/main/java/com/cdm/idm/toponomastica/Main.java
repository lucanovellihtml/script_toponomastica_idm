package com.cdm.idm.toponomastica;

import java.util.List;
import com.cdm.idm.toponomastica.database.DbResidenceCheck;
import com.cdm.idm.toponomastica.user.User;

public class Main {
    public static void main(String[] args) {
        /*
         * DbManagement prova = new DbManagement("localhost", "openidm", "!4dm1n1DM!",
         * "5004", "openidm");
         * Connection conn = prova.openConnection();
         * 
         * if (conn == null)
         * System.err.println("Connessione fallita...");
         * else{
         * prova.closeConnection(conn);
         * }
         */

        DbResidenceCheck prova = new DbResidenceCheck();
        List<User> lista = prova.getUserDomiciledMilan();

        System.out.println("Size " + lista.size());

        for (User singleUser : lista) {
            System.out.println(singleUser.toString());
        }

    }
}