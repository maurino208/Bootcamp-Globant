package com.bootcamp.juan.resource;

import com.bootcamp.juan.domain.Users;
import com.bootcamp.juan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UsersResource {

    private final UserService userService;

    @Autowired
    public UsersResource(UserService userService){
        this.userService=userService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Users> insetUser(@Valid @RequestBody Users users) {
        userService.addUsers(users);
        return new ResponseEntity<Users>
                (userService.findUser(users.getNombre(), users.getApellido()), HttpStatus.OK);
    }

    @GetMapping(path = "/{name}/{lastName}")
    public ResponseEntity<Users> findUser(@PathVariable String name, @PathVariable String lastName){
        return new ResponseEntity<Users>(userService.findUser(name, lastName), HttpStatus.OK);
    }

}