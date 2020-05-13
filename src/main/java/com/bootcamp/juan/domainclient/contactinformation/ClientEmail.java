package com.bootcamp.juan.domainclient.contactinformation;

import javax.persistence.*;

@Entity
public class ClientEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailAddress;
    private String emailType;
    @Column(name = "isPrimary")
    private boolean primary;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getEmailType() {
        return emailType;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
