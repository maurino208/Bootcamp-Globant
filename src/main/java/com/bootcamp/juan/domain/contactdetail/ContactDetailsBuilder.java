package com.bootcamp.juan.domain.contactdetail;

import java.util.List;

public class ContactDetailsBuilder {

    private Address address;
    private Phone phone;
    private List<Email> emails;

    public ContactDetailsBuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public ContactDetailsBuilder withPhones(Phone phone){
        this.phone = phone;
        return this;
    }

    public ContactDetailsBuilder withEmails(List<Email> emails){
        this.emails=emails;
        return this;
    }

    public ContactDetails build(){
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setAddress(address);
        contactDetails.setEmails(emails);
        contactDetails.setPhone(phone);

        return contactDetails;
    }

}
