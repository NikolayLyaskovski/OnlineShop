package com.example.online.shop.service;

import com.example.online.shop.model.Shipment;
import com.example.online.shop.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShipmentServiceImpl implements ShipmentService {
    private final ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public void createShipment(Shipment shipment) {

    }

    @Override
    public void getShipment(Long shipmentId) {

    }

    @Override
    public void getAllShipment() {

    }

    @Override
    public void deleteShipment(Long shipmentId) {

    }

    @Override
    public void updateShipment(Shipment shipment) {

    }
}
