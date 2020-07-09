package com.example.online.shop.service;

import com.example.online.shop.model.User;
import com.example.online.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void getUser(Long userId) {

    }

    @Override
    public void getAllUsers() {

    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void updateUser(User user) {

    }
}
