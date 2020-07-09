package com.example.online.shop.service;

import com.example.online.shop.model.Address;
import org.springframework.stereotype.Service;


@Service
public interface AddressService {
    void createAddress(Address address);
    void getAddress(Long addressId);
    void getAllAddress();
    void deleteAddress(Long addressId);
    void updateAddress(Address address);

}
