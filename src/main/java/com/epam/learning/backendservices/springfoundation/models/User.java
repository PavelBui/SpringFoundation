package com.epam.learning.backendservices.springfoundation.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name="userName")
    private String name;
    @Column(name="userEmail")
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
