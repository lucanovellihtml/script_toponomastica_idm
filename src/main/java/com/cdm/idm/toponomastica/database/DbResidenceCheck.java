package com.cdm.idm.toponomastica.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.identityconnectors.common.logging.Log;
import com.cdm.idm.toponomastica.user.User;
import com.cdm.idm.toponomastica.util.ConstantToponomastica;

public class DbResidenceCheck {

    // Log
    private static final Log log = Log.getLog(DbResidenceCheck.class);

    public List<User> getUserDomiciledMilan() {

        String method = "[getUserDomiciledMilan]::";

        // Lista user del risultato della query
        List<User> listUserQuery = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;

        DbManagement dbManagement = new DbManagement();

        // Creazione e apertura della connessione al database
        Connection connection = dbManagement.openConnection();

        if (connection != null) {

            try {

                // 3. Creare un oggetto Statement
                statement = connection.createStatement();

                log.info(method + "Esecuzione della query...");

                // 4. Eseguire una query di test
                resultSet = statement.executeQuery(ConstantToponomastica.QUERY_ANAGRAFICA);

                // 5. Elaborare i risultati
                while (resultSet.next()) {
                    User user = new User();
                    user.setUsername(resultSet.getString("username"));
                    user.setResidenceAddress(resultSet.getString("ResidenceAddress"));
                    listUserQuery.add(user);
                }

                log.info(method + "Query eseguita correttamente.");

            } catch (SQLException e) {
                log.error(method + "Errore durante la connessione o l'esecuzione della query SQL: " + e.getMessage());

            } finally {

                // 6. Chiudere la connessione, lo Statement, il ResultSet e la Connection nel
                // blocco finally
                try {

                    if (resultSet != null) {
                        resultSet.close();
                    }

                    if (statement != null) {
                        statement.close();
                    }

                    dbManagement.closeConnection(connection);

                } catch (SQLException e) {
                    log.error(method + "Errore durante la chiusura della connessione:" + e.getMessage());
                }

            }
        }

        return listUserQuery;
    }

}
