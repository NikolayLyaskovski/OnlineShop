package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    void createAddress();
    void getAddress();
    void getAllAddress();
    void deleteAddress();
    void updateAddress();

}
