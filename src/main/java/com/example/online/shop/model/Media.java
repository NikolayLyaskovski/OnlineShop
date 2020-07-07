package com.example.online.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "medias")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mediaId;

    @ManyToOne
    @JoinColumn(name = "reviewId")
    private Review review;
}
