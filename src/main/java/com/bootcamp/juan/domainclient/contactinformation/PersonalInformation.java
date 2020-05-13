package com.bootcamp.juan.domainclient.contactinformation;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalInformation {
    private String name;
    private String lastName;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
