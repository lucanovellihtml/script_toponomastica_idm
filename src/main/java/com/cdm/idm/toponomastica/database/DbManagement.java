package com.cdm.idm.toponomastica.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagement {

    private String ip, user, password, port, nameDb;

    private String PREFIX_URL = "jdbc:postgresql://";

    /* Costruttore */
    public DbManagement(String ip, String user, String password, String port, String nameDb) {
        this.ip = ip;
        this.user = user;
        this.password = password;
        this.nameDb = nameDb;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }

    public String getNameDb() {
        return nameDb;
    }

    public String getPREFIX_URL() {
        return PREFIX_URL;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setNameDb(String nameDb) {
        this.nameDb = nameDb;
    }

    public void setPREFIX_URL(String pREFIX_URL) {
        PREFIX_URL = pREFIX_URL;
    }

    /**
     * Metodo che costruisce la url per la connessione al database
     * 
     * @return la url della connessione al database
     */
    public String getUrl() {
        return this.PREFIX_URL + this.ip + ":" + this.port + "/" + this.nameDb;
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
            System.out.println(method + "Tentativo di connessione al database...");
            connection = DriverManager.getConnection(getUrl(), this.user, this.password);
            System.out.println(method + "Connessione al database stabilita con successo!");

        } catch (ClassNotFoundException e) {
            System.err.println(method + "Errore: Driver JDBC per PostgreSQL non trovato!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.err.println(method + "Errore durante la connessione o l'esecuzione della query SQL:");
            e.printStackTrace();
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
                System.out.println(method + "Connessione al database chiusa.");
            }
        } catch (SQLException e) {
            System.err.println(method + "Errore durante la chiusura della connessione:");
            e.printStackTrace();
        }

    }

}
