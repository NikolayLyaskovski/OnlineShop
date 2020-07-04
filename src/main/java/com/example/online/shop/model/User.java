package com.example.online.shop.model;

import com.example.online.shop.enums.UserType;

public class User {
    private Long id;
    private UserType userType;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
