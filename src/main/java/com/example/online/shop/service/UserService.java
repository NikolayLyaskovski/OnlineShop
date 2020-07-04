package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void createUser();
    void getUser();
    void getAllUsers();
    void deleteUser();
    void updateUser();


}
