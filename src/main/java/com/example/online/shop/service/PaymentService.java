package com.example.online.shop.service;

import com.example.online.shop.model.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void createPayment(Payment payment);
    void getPayment(Long paymentId);
    void getAllPayment();
    void deletePayment(Long paymentId);
    void updatePayment(Payment payment);

}
