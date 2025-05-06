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
        this.ip = ip;
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
        return getPREFIX_URL() + getIp() + ":" + getPort() + "/" + getNameDb();
    }

}
