package com.epam.learning.backendservices.springfoundation.controller;

import com.epam.learning.backendservices.springfoundation.dao.UserDAO;
import com.epam.learning.backendservices.springfoundation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Component
@RequestMapping("/user")
public class UserController {

    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/new")
    public String create(@PathVariable("name") String name, @PathVariable("email") String email) {
        userDAO.create(name, email);
        return "Created";
    }

    @GetMapping("/{id}")
    public String read(@PathVariable("id") UUID id) {
        User user = userDAO.get(id);
        return "Name: " + user.getName() + "email: " + user.getEmail();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") UUID id, @PathVariable("name") String name, @PathVariable("email") String email) {
        userDAO.update(id, name, email);
        return "Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id) {
        userDAO.delete(id);
        return "Deleted";
    }

}