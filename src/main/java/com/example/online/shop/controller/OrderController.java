package com.example.online.shop.controller;


import com.example.online.shop.model.Order;
import com.example.online.shop.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {

    }

    @PutMapping
    public void updateOrder(@RequestBody Order order){

    }

    @GetMapping("/{orderId}")
    public Order order(){
        return null;
    }

    @DeleteMapping
    public void deleteOrder(@PathVariable Long orderId){

    }
}

