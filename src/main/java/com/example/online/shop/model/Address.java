package com.example.online.shop.model;


import javax.persistence.*;


@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adressId;

    @Column
    private String street;

    public Long getId() {
        return adressId;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
