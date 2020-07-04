package com.example.online.shop.model;


import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column
    private Long quantity;

    public Long getOrderId() {
        return orderId;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
