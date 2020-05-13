package com.bootcamp.juan.transformer;

import com.bootcamp.juan.domainclient.ClientUser;
import com.bootcamp.juan.domainclient.ClientUserBuilder;
import com.bootcamp.juan.domainclient.contactinformation.*;
import com.bootcamp.juan.domain.Users;
import org.apache.commons.collections4.Transformer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFromDomain implements Transformer<Users, ClientUser> {

    @Override
    public ClientUser transform(Users users) {

        List<ClientPhone> phoneList= new ArrayList<ClientPhone>();
        phoneList.add(new ClientPhonesBuilder()
                .withPhoneNumber(users.getContactDetails().getPhone().getPhoneNumber())
                .withCountreCode(users.getContactDetails().getPhone().getCountryCode())
                .withPhoneType(users.getContactDetails().getPhone().getPhoneType()).build());

        List<ClientEmail> emailList=new ArrayList<>();
        emailList.add(new ClientEmailBuilder()
                .withEmailAddress(users.getContactDetails().getEmails().get(0).getEmailAddress())
                .withEmailType(users.getContactDetails().getEmails().get(0).getEmailType())
                .withPrimary(users.getContactDetails().getEmails().get(0).isPrimary())
                .build());

        return new ClientUserBuilder()
                .withPersonalInformation(new PersonalInformationBuilder()
                .withName(users.getNombre())
                .withLastName(users.getApellido())
                .build())
                .withContactInformation(new ContactInformationBuilder()
                        .withAddress(new ClientAddressBuilder()
                                .withAddressLine1(users.getContactDetails().getAddress().getAddressLine1())
                                .withAddressLine2(users.getContactDetails().getAddress().getAddressLine2())
                                .withCity(users.getContactDetails().getAddress().getCity())
                                .withZipCode(users.getContactDetails().getAddress().getZipCode())
                                .build())
                        .withPhones(phoneList)
                        .withEmails(emailList)
                        .build())
                .build();


    }
}
