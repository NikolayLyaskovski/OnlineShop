package com.example.online.shop.service;

import com.example.online.shop.model.Address;
import com.example.online.shop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressServiceImpl(AddressRepository addressRepository) {
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
