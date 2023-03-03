package com.epam.learning.backendservices.springfoundation.dao;

import com.epam.learning.backendservices.springfoundation.data.UserRepository;
import com.epam.learning.backendservices.springfoundation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    public User get(UUID id) {
        return userRepository.findById(id);
    }

    public void create(String name, String email) {
        userRepository.save(new User(name, email));
    }

    public void update(UUID id, String name, String email) {
        User user = userRepository.findById(id);
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
    }

    public void delete(UUID id) {
        userRepository.deleteById(id);
    }

}
