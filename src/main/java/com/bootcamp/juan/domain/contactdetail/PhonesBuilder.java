package com.bootcamp.juan.domain.contactdetail;

public class PhonesBuilder {

    private int phoneNumber;
    private int countryCode;
    private String phoneType;


    public PhonesBuilder withPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }

    public PhonesBuilder withCountryCode(int countryCode){
        this.countryCode=countryCode;
        return this;
    }

    public PhonesBuilder withPhoneType(String phoneType){
        this.phoneType=phoneType;
        return this;
    }

    public Phone build(){
        Phone phone =new Phone();
        phone.setPhoneNumber(phoneNumber);
        phone.setCountryCode(countryCode);
        phone.setPhoneType(phoneType);

        return phone;
    }

}
