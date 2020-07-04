package com.example.online.shop.controller;


import com.example.online.shop.model.User;
import com.example.online.shop.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user){

    }

    @PutMapping
    public void updateUser (@RequestBody User user){

    }

    @GetMapping("/{userId}")
    public User user(){
        return null;
    }

    @DeleteMapping
    public void deleteUser(@PathVariable Long userId){

    }
}
