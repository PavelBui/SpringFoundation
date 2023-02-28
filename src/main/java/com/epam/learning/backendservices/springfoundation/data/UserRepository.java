package com.epam.learning.backendservices.springfoundation.data;

import com.epam.learning.backendservices.springfoundation.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
