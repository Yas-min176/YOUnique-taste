package com.younique.user.controller;

import com.younique.user.model.User;
import com.younique.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return repository.save(user);
    }
}
