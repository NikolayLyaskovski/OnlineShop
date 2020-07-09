package com.example.online.shop.service;

import com.example.online.shop.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void createUser(User user);
    void getUser(Long userId);
    void getAllUsers();
    void deleteUser(Long userId);
    void updateUser(User user);


}
