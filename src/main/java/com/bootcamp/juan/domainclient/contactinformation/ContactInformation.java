package com.bootcamp.juan.domainclient.contactinformation;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class ContactInformation {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address")
    private ClientAddress clientAddress;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Phone")
    private List<ClientPhone> clientPhones;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Emails")
    private List<ClientEmail> clientEmails;

    public List<ClientPhone> getClientPhones() {
        return clientPhones;
    }

    public void setClientPhones(List <ClientPhone> clientPhones) {
        this.clientPhones = clientPhones;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public List<ClientEmail> getClientEmails() {
        return clientEmails;
    }

    public void setClientEmails(List<ClientEmail> clientEmails) {
        this.clientEmails = clientEmails;
    }
}
