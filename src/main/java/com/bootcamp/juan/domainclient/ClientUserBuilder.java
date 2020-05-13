package com.bootcamp.juan.domainclient;

import com.bootcamp.juan.domainclient.contactinformation.ContactInformation;
import com.bootcamp.juan.domainclient.contactinformation.PersonalInformation;

public class ClientUserBuilder {

    private PersonalInformation personalInformation;
    private ContactInformation contactInformation;

    public ClientUserBuilder withPersonalInformation(PersonalInformation personalInformation){
        this.personalInformation=personalInformation;
        return this;
    }

    public ClientUserBuilder withContactInformation(ContactInformation contactInformation){
        this.contactInformation=contactInformation;
        return this;
    }

    public ClientUser build(){

        ClientUser clientUser = new ClientUser();
        clientUser.setPersonalInformation(personalInformation);
        clientUser.setContactInformation(contactInformation);

        return clientUser;
    }
}
