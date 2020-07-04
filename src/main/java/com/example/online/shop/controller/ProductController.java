package com.example.online.shop.controller;

import com.example.online.shop.model.Product;
import com.example.online.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void createProduct(@RequestBody Product product){

    }

    @PutMapping
    public void updateProduct(@RequestBody Product product){

    }

    @GetMapping
    public Product product(){
        return  null;
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable Long productId){

    }
}
