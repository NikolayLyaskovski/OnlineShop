package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface WarehouseService {
    void createWarehouse();
    void getWarehouse();
    void deleteWarehouse();
    void updateWarehouse();

}
