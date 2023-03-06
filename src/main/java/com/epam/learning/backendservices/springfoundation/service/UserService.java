package com.epam.learning.backendservices.springfoundation.service;

import com.epam.learning.backendservices.springfoundation.models.User;

import java.util.UUID;

public interface UserService {
    User get(UUID id);

    User create(User user);

    User update(UUID id, String name, String email);

    void delete(UUID id);

}
