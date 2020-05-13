package com.bootcamp.juan.domainclient.contactinformation;

import com.bootcamp.juan.domain.contactdetail.Address;
import com.bootcamp.juan.domain.contactdetail.Email;

import java.util.List;

public class ContactInformationBuilder {

    private ClientAddress clientAddress;
    private List<ClientPhone> clientPhones;
    private List<ClientEmail> clientEmails;

    public ContactInformationBuilder withAddress(ClientAddress clientAddress){
        this.clientAddress=clientAddress;
        return this;
    }

    public ContactInformationBuilder withPhones(List<ClientPhone> clientPhones){
        this.clientPhones = clientPhones;
        return this;
    }

    public ContactInformationBuilder withEmails(List<ClientEmail> clientEmails){
        this.clientEmails=clientEmails;
        return this;
    }

    public ContactInformation build(){
        ContactInformation information = new ContactInformation();
        information.setClientAddress(clientAddress);
        information.setClientEmails(clientEmails);
        information.setClientPhones(clientPhones);

        return information;
    }
}
