package com.bootcamp.juan.transformer;

import com.bootcamp.juan.domain.UserBuilder;
import com.bootcamp.juan.domain.Users;
import com.bootcamp.juan.domain.contactdetail.*;
import com.bootcamp.juan.domainclient.ClientUser;
import com.bootcamp.juan.domainclient.contactinformation.ClientPhone;
import org.apache.commons.collections4.Transformer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserToDomain implements Transformer<ClientUser, Users> {
    @Override
    public Users transform(ClientUser clientUser) {

        List<Email> emailList=new ArrayList<>();
        emailList.add(new EmailBuilder()
                .withEmailAddress(clientUser.getContactInformation().getClientEmails().get(0).getEmailAddress())
                .withEmailType(clientUser.getContactInformation().getClientEmails().get(0).getEmailType())
                .build());

        return new UserBuilder()
                .withFirstName(clientUser.getPersonalInformation().getName())
                .withLastName(clientUser.getPersonalInformation().getLastName())
                .withContactDetail(new ContactDetailsBuilder()
                        .withAddress(new AddressBuilder()
                                .withAddressLine1(clientUser.getContactInformation().getClientAddress().getAddressLine1())
                                .withAddressLine2(clientUser.getContactInformation().getClientAddress().getAddressLine2())
                                .withCity(clientUser.getContactInformation().getClientAddress().getCity())
                                .withZipCode(clientUser.getContactInformation().getClientAddress().getZipCode())
                                .build())
                        .withEmails(emailList)
                        .withPhones(new PhonesBuilder()
                                .withPhoneNumber(clientUser.getContactInformation().getClientPhones().get(0).getPhoneNumber())
                                .withPhoneType(clientUser.getContactInformation().getClientPhones().get(0).getPhoneType())
                                .withCountryCode(clientUser.getContactInformation().getClientPhones().get(0).getCountryCode())
                                .build())
                        .build())
                .build();
    }
}
