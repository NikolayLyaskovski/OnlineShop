package com.example.online.shop.model;

import com.example.online.shop.enums.PaymentType;

public class Payment {
    private Long id;
    private PaymentType paymentType;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
