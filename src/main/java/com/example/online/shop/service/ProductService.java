package com.example.online.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void createProduct();
    void getProduct();
    void getAllProduct();
    void deleteProduct();
    void updateProduct();
}
