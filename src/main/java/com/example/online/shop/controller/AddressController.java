package com.example.online.shop.controller;

import com.example.online.shop.model.Address;
import com.example.online.shop.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/adresses")
public class AddressController {

    private final AddressService addressService;


    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void createAddress(@RequestBody Address address) {

    }

    @PutMapping
    public void updateAddress(@RequestBody Address address) {

    }

    @GetMapping("/{addressId}")
    public Address address() {
        return null;
    }

    @DeleteMapping
    public void deleteAddress (@PathVariable Long addressId){

    }
}
