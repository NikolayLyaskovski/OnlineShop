package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void createPayment();
    void getPayment();
    void getAllPayment();
    void deletePayment();
    void updatePayment();

}
