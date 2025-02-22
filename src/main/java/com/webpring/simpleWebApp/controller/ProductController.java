package com.webpring.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webpring.simpleWebApp.model.Product;
import com.webpring.simpleWebApp.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
