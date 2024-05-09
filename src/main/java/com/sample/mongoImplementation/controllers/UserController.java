package com.sample.mongoImplementation.controllers;

import com.sample.mongoImplementation.entities.UserEntity;
import com.sample.mongoImplementation.models.UserModel;
import com.sample.mongoImplementation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public boolean createUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }
}
