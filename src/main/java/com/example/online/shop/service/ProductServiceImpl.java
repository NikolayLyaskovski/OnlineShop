package com.example.online.shop.service;

import com.example.online.shop.model.Product;
import com.example.online.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void getProduct(Long productId) {

    }

    @Override
    public void getAllProduct() {

    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public void updateProduct(Product product) {

    }
}
