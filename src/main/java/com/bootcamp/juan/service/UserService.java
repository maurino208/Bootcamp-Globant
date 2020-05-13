package com.bootcamp.juan.service;

import com.bootcamp.juan.domain.Users;
import com.bootcamp.juan.domainclient.ClientUser;
import com.bootcamp.juan.exception.UserNotFound;
import com.bootcamp.juan.repository.ClientUserRepository;
import com.bootcamp.juan.transformer.UserFromDomain;
import com.bootcamp.juan.transformer.UserToDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ClientUserRepository clientUserRepository;
    private final UserFromDomain transformer;
    private final UserToDomain transformerTo;

    @Autowired
    public UserService(ClientUserRepository clientUserRepository, UserFromDomain transformer, UserToDomain transformerTo){
        this.clientUserRepository=clientUserRepository;
        this.transformer=transformer;
        this.transformerTo=transformerTo;
    }

    public void addUsers(Users users){
        clientUserRepository.save(transformer.transform(users));
    }

    public Users findUser(String name, String lastName){
        ClientUser client=clientUserRepository.findByPersonalInformationNameAndPersonalInformationLastName(name, lastName);
        if(client!= null){
            return transformerTo.transform(client);
        }
        throw new UserNotFound("Usuario no encontrado");
    }


}
