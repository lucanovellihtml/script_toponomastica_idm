package com.cdm.idm.toponomastica.user;

public class User {

    private String username, residenceAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", residenceAddress=" + residenceAddress + "]";
    }

}
