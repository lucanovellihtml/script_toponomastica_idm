package com.cdm.idm.toponomastica.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.identityconnectors.common.logging.Log;

import com.cdm.idm.toponomastica.util.ConstantToponomastica;

public class DbManagement {

    // Log
    private static final Log log = Log.getLog(DbManagement.class);

    private String ip, user, password, port, nameDb;

    /* Costruttore */
    public DbManagement() {
        this.ip = ConstantToponomastica.IP;
        this.user = ConstantToponomastica.USERNAME;
        this.password = ConstantToponomastica.PASSWORD;
        this.nameDb = ConstantToponomastica.NAME_DB;
        this.port = ConstantToponomastica.PORT;
    }

    /**
     * Metodo che costruisce la url per la connessione al database
     * 
     * @return la url della connessione al database
     */
    public String getUrl() {
        return ConstantToponomastica.PREFIX_URL + this.ip + ":" + this.port + "/"
                + this.nameDb;
    }

    /**
     * Metodo che crea e apre la connessione al database
     * 
     * @return l'oggetto della connessione al database
     */
    public Connection openConnection() {

        // Variabile oggetto connection
        Connection connection = null;

        String method = "[openConnection]::";

        try {

            // 1. Caricare il driver JDBC per PostgreSQL
            Class.forName("org.postgresql.Driver");

            // 2. Stabilire la connessione al database
            log.info(method + "Tentativo di connessione al database...");
            connection = DriverManager.getConnection(getUrl(), this.user, this.password);
            log.info(method + "Connessione al database stabilita con successo!");

        } catch (ClassNotFoundException e) {
            log.error(method + "Errore: Driver JDBC per PostgreSQL non trovato!");
            e.printStackTrace();

        } catch (SQLException e) {
            log.error(method + "Errore durante la connessione o l'esecuzione della query SQL:" + e.getMessage());
        }

        return connection;

    }

    /**
     * Metodo che chiude la connessione al database
     * 
     * @param connection l'oggetto della connessione aperta del database
     */
    public void closeConnection(Connection connection) {

        String method = "[closeConnection]::";

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                log.info(method + "Connessione al database chiusa.");
            }
        } catch (SQLException e) {
            log.error(method + "Errore durante la chiusura della connessione:" + e.getMessage());
        }

    }

}
