package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/findById")
    User findAll(@RequestParam("id") Long id) {
        return userService.findById(id);
    }

}
