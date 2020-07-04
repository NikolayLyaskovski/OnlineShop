package com.example.online.shop.controller;


import com.example.online.shop.model.Payment;
import com.example.online.shop.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public void createPayment(@RequestBody Payment payment){

    }

    @PutMapping
    public void updatePayment(@RequestBody Payment payment){

    }

    @GetMapping("/{paymentId}")
    public Payment payment(){
        return null;
    }

    @DeleteMapping
    public void deletePayment(@PathVariable Long paymentId){

    }
}
