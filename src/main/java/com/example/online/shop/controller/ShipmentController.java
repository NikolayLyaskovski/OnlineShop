package com.example.online.shop.controller;

import com.example.online.shop.model.Shipment;
import com.example.online.shop.service.ShipmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping
    public void createShipment(@RequestBody Shipment shipment){

    }

    @PutMapping
    public void updateShipment(@RequestBody Shipment shipment){

    }

    @GetMapping
    public Shipment shipment(){
        return  null;
    }

    @DeleteMapping
    public void deleteShipment(@PathVariable Long shipmentId){

    }
}
