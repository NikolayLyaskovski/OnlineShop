package com.example.online.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "warehouses")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;
    @Column
    private Long quantity;

    public Long getWarehouseId() {
        return warehouseId;
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
