package com.epam.learning.backendservices.springfoundation.service;

import com.epam.learning.backendservices.springfoundation.dao.UserRepository;
import com.epam.learning.backendservices.springfoundation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository ;

    public User get(UUID id) {
        return userRepository.findById(id);
    }

    public User create(User user) {
        userRepository.save(user);
        return user;
    }

    public User update(UUID id, String name, String email) {
        User user = userRepository.findById(id);
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    public void delete(UUID id) {
        userRepository.deleteById(id);
    }

}
