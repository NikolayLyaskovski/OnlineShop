package com.example.online.shop.model;


import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Column
    private String country;

    public Long getCityId() {
        return cityId;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
