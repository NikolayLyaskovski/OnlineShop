package com.example.online.shop.model;

import com.example.online.shop.enums.ProductType;

import javax.persistence.*;

@Entity
@Table(name = "prodicts")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column
    private Long price;

    public Long getId() {
        return productId;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
