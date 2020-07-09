package com.example.online.shop.service;

import com.example.online.shop.model.Order;
import com.example.online.shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Order order) {

    }

    @Override
    public void getOrder(Long orderId) {

    }

    @Override
    public void getAllOrder() {

    }

    @Override
    public void deleteOrder(Long orderId) {

    }

    @Override
    public void updateOrder(Order order) {

    }
}
