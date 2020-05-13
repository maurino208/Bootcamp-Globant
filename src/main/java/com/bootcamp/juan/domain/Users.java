package com.bootcamp.juan.domain;
import com.bootcamp.juan.domain.contactdetail.ContactDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Users{

    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    private ContactDetails contactDetails;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }
}
