package com.example.online.shop.service;

import com.example.online.shop.model.Address;
import com.example.online.shop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }



    @Override
    public void createAddress(Address address) {

    }

    @Override
    public void getAddress(Long addressId) {

    }

    @Override
    public void getAllAddress() {

    }

    @Override
    public void deleteAddress(Long addressId) {

    }

    @Override
    public void updateAddress(Address address) {

    }
}
