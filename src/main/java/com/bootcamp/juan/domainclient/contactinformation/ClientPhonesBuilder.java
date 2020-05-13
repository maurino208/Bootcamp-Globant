package com.bootcamp.juan.domainclient.contactinformation;

public class ClientPhonesBuilder {

    private int phoneNumber;
    private int countryCode;
    private String phoneType;
    private boolean primary=false;

    public ClientPhonesBuilder withPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }

    public ClientPhonesBuilder withCountreCode(int countryCode){
        this.countryCode=countryCode;
        return this;
    }

    public ClientPhonesBuilder withPhoneType(String phoneType){
        this.phoneType=phoneType;
        return this;
    }

    public ClientPhonesBuilder withPrimary(boolean primary){
        this.primary=primary;
        return this;
    }

    public ClientPhone build(){
        ClientPhone clientPhone = new ClientPhone();
        clientPhone.setPhoneNumber(phoneNumber);
        clientPhone.setCountryCode(countryCode);
        clientPhone.setPhoneType(phoneType);
        clientPhone.setPrimary(primary);

        return clientPhone;
    }
}
