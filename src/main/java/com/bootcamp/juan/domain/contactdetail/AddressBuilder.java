package com.bootcamp.juan.domain.contactdetail;

public class AddressBuilder {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private int zipCode;

    public AddressBuilder withAddressLine1(String addressLine1){
        this.addressLine1=addressLine1;
        return this;
    }

    public AddressBuilder withAddressLine2(String addressLine2){
        this.addressLine2=addressLine2;
        return this;
    }

    public AddressBuilder withCity(String city){
        this.city=city;
        return this;
    }

    public AddressBuilder withZipCode(int zipCode){
        this.zipCode=zipCode;
        return this;
    }

    public Address build(){
        Address address=new Address();
        address.setAddressLine1(addressLine1);
        address.setAddressLine2(addressLine2);
        address.setCity(city);
        address.setZipCode(zipCode);

        return address;
    }
}
