package com.bootcamp.juan.domainclient.contactinformation;

import javax.persistence.*;

@Entity
public class ClientPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int phoneNumber;
    private int countryCode;
    private String phoneType;
    @Column(name = "isPrimary")
    private boolean primary=true;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
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
