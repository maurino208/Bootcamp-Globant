package com.bootcamp.juan.domainclient;

import com.bootcamp.juan.domainclient.contactinformation.ContactInformation;
import com.bootcamp.juan.domainclient.contactinformation.PersonalInformation;

import javax.persistence.*;

@Entity
public class ClientUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private PersonalInformation personalInformation;
    private ContactInformation contactInformation;

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }
}
