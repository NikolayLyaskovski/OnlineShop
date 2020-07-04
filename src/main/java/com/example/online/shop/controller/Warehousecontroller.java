package com.example.online.shop.controller;

import com.example.online.shop.model.Warehouse;
import com.example.online.shop.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/warehouses")
public class Warehousecontroller {

    private final WarehouseService warehouseService;


    public Warehousecontroller(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @PostMapping
    public void createWarehouse(@RequestBody Warehouse warehouse){

    }

    @PutMapping
    public void updateWarehouse(@RequestBody Warehouse warehouse){

    }

    @GetMapping
    public Warehouse warehouse(){
        return null;
    }

    @DeleteMapping
    public void deleteWarehouse(@PathVariable Long warehouseId){

    }

}
