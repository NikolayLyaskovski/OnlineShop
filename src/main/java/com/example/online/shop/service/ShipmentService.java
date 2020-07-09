package com.example.online.shop.service;

import com.example.online.shop.model.Shipment;
import org.springframework.stereotype.Service;

@Service
public interface ShipmentService {

    void createShipment(Shipment shipment);
    void getShipment(Long shipmentId);
    void getAllShipment();
    void deleteShipment(Long shipmentId);
    void updateShipment(Shipment shipment);

}
