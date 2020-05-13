package com.bootcamp.juan.domainclient.contactinformation;

public class ClientEmailBuilder {

    private String emailAddress;
    private String emailType;
    private boolean primary;

    public ClientEmailBuilder withEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
        return this;
    }

    public ClientEmailBuilder withEmailType(String emailType){
        this.emailType=emailType;
        return this;
    }

    public ClientEmailBuilder withPrimary(boolean primary){
        this.primary=primary;
        return this;
    }

    public ClientEmail build(){
        ClientEmail clientEmail =new ClientEmail();
        clientEmail.setEmailAddress(emailAddress);
        clientEmail.setEmailType(emailType);
        clientEmail.setPrimary(primary);

        return clientEmail;
    }
}
