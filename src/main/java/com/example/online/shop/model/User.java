package com.example.online.shop.model;

import com.example.online.shop.enums.UserType;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public Long getUserId() {
        return userId;
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
