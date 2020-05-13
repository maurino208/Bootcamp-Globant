package com.bootcamp.juan.domain.contactdetail;

public class Phone {

     private int phoneNumber;
     private int countryCode;
     private String phoneType;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}
