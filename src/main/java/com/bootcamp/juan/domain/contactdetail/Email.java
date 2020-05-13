package com.bootcamp.juan.domain.contactdetail;

public class Email {

    private String emailAddress;
    private String emailType;
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
