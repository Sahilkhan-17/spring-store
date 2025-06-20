package com.codewithsahil.store.controllers;


import com.codewithsahil.store.entities.User;
import com.codewithsahil.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
