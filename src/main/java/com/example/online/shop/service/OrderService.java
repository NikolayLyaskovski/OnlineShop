package com.example.online.shop.service;

import com.example.online.shop.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void createOrder(Order order);
    void getOrder(Long orderId);
    void getAllOrder();
    void deleteOrder(Long orderId);
    void updateOrder(Order order);

}
