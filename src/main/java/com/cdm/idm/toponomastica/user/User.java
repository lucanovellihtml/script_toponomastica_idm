package com.cdm.idm.toponomastica.user;

public class User {

    private String username, residenceAddress, typeViaCode, residenceAddressNew;
    private Integer streetCode, idc;
    private boolean updateFlag = false;

    public String getUsername() {
        return username;
    }

    public String getTypeViaCode() {
        return typeViaCode;
    }

    public void setTypeViaCode(String typeViaCode) {
        this.typeViaCode = typeViaCode;
    }

    public Integer getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Integer streetCode) {
        this.streetCode = streetCode;
    }

    public Integer getIdc() {
        return idc;
    }

    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    public boolean isUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(boolean updateFlag) {
        this.updateFlag = updateFlag;
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
        return "User [username=" + username + ", residenceAddress=" + residenceAddress + ", typeViaCode=" + typeViaCode
                + ", streetCode=" + streetCode + ", idc=" + idc + ", updateFlag=" + updateFlag
                + ", residenceAddressNew=" + residenceAddressNew + "]";
    }

    public String getResidenceAddressNew() {
        return residenceAddressNew;
    }

    public void setResidenceAddressNew(String residenceAddressNew) {
        this.residenceAddressNew = residenceAddressNew;
    }

}
