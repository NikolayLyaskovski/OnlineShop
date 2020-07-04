package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void createOrder();
    void getOrder();
    void getAllOrder();
    void deleteOrder();
    void updateOrder();

}
