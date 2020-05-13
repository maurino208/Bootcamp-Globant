package com.bootcamp.juan.domainclient.contactinformation;

public class ClientAddressBuilder {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private int zipCode;

    public ClientAddressBuilder withAddressLine1(String addressLine1){
        this.addressLine1=addressLine1;
        return this;
    }

    public ClientAddressBuilder withAddressLine2(String addressLine2){
        this.addressLine2=addressLine2;
        return this;
    }

    public ClientAddressBuilder withCity(String city){
        this.city=city;
        return this;
    }

    public ClientAddressBuilder withZipCode(int zipCode){
        this.zipCode=zipCode;
        return this;
    }

    public ClientAddress build(){
        ClientAddress clientAddress =new ClientAddress();
        clientAddress.setAddressLine1(addressLine1);
        clientAddress.setAddressLine2(addressLine2);
        clientAddress.setCity(city);
        clientAddress.setZipCode(zipCode);

        return clientAddress;
    }
}
