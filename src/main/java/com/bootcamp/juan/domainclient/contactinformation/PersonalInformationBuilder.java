package com.bootcamp.juan.domainclient.contactinformation;

public class PersonalInformationBuilder {

    private String name;
    private String lastName;

    public PersonalInformationBuilder withName(String name){
        this.name=name;
        return this;
    }

    public PersonalInformationBuilder withLastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public PersonalInformation build(){

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setName(name);
        personalInformation.setLastName(lastName);

        return personalInformation;
    }
}
