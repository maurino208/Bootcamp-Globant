package com.bootcamp.juan.domain;

import com.bootcamp.juan.domain.contactdetail.ContactDetails;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private ContactDetails contactDetails;


    public UserBuilder withFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public UserBuilder withContactDetail(ContactDetails contactDetails){
        this.contactDetails=contactDetails;
        return this;
    }

    public Users build(){
        Users users = new Users();
        users.setNombre(firstName);
        users.setApellido(lastName);
        users.setContactDetails(contactDetails);

        return users;
    }
}
