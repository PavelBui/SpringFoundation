package com.epam.learning.backendservices.springfoundation.controller;

import com.epam.learning.backendservices.springfoundation.models.User;
import com.epam.learning.backendservices.springfoundation.service.UserServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserServiceImpl userServiceImpl;

    public ResponseEntity<String> create(@RequestParam("name") String name, @RequestParam("email") String email) {
        userServiceImpl.create(new User(name, email));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<String> read(UUID id) {
        userServiceImpl.get(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<String> update(@PathVariable @NotNull UUID id, @RequestParam("name") String name, @RequestParam("email") String email) {
        userServiceImpl.update(id, name, email);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<String> delete(UUID id) {
        userServiceImpl.delete(id);
        return ResponseEntity.ok().build();
    }

}