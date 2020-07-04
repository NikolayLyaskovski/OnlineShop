package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface ShipmentService {

    void createShipment();
    void getShipment();
    void getAllShipment();
    void deleteShipment();
    void updateShipment();

}
