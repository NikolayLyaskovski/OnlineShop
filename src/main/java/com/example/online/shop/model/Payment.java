package com.example.online.shop.model;

import com.example.online.shop.enums.PaymentType;

import javax.persistence.*;


@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    public Long getPaymentId() {
        return paymentId;
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
