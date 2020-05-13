package com.bootcamp.juan.domain.contactdetail;

public class EmailBuilder {

    private String emailAddress;
    private String emailType;
    private boolean primary;

    public EmailBuilder withEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
        return this;
    }

    public EmailBuilder withEmailType(String emailType){
        this.emailType=emailType;
        return this;
    }

    public EmailBuilder withPrimary(boolean primary){
        this.primary=primary;
        return this;
    }

    public Email build(){
        Email email=new Email();
        email.setEmailAddress(emailAddress);
        email.setEmailType(emailType);
        email.setPrimary(primary);

        return email;
    }
}
