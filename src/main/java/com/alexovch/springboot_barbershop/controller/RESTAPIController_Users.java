package com.alexovch.springboot_barbershop.controller;


import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import com.alexovch.springboot_barbershop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class RESTAPIController_Users {

    private final UserService userService;

    @GetMapping("")
    public List<UserBarbershop> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserBarbershop getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping("")
    public UserBarbershop createUser(@RequestBody UserBarbershop user) {
        userService.saveUser(user);
        return user;
    }

    @PutMapping("")
    public UserBarbershop updateUser(@RequestBody UserBarbershop user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User with id " + id + " was deleted";
    }
}
