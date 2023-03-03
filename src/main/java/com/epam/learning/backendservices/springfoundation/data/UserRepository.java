package com.epam.learning.backendservices.springfoundation.data;

import com.epam.learning.backendservices.springfoundation.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(UUID id);

    void deleteById(UUID id);
}
