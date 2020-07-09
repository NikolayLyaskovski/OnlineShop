package com.example.online.shop.service;

import com.example.online.shop.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void createProduct(Product product);
    void getProduct(Long productId);
    void getAllProduct();
    void deleteProduct(Long productId);
    void updateProduct(Product product);
}
