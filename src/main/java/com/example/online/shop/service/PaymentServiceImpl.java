package com.example.online.shop.service;

import com.example.online.shop.model.Payment;
import com.example.online.shop.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void createPayment(Payment payment) {

    }

    @Override
    public void getPayment(Long paymentId) {

    }

    @Override
    public void getAllPayment() {

    }

    @Override
    public void deletePayment(Long paymentId) {

    }

    @Override
    public void updatePayment(Payment payment) {

    }
}
