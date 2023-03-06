package com.epam.learning.backendservices.springfoundation.controller;

import com.sun.istack.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/user")
public interface UserApi {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<String> create(@RequestParam("name") String name, @RequestParam("email") String email);

    @GetMapping("/{id}")
    ResponseEntity<String> read(@PathVariable @NotNull UUID id);

    @PutMapping("/{id}")
    ResponseEntity<String> update(@PathVariable @NotNull UUID id, @RequestParam("name") String name, @RequestParam("email") String email);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    ResponseEntity<String> delete(@PathVariable @NotNull UUID id);
}
