package com.bootcamp.juan.repository;

import com.bootcamp.juan.domainclient.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
    ClientUser findByPersonalInformationNameAndPersonalInformationLastName(String name, String lastName);
}
