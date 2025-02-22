package com.webpring.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webpring.simpleWebApp.model.Product;

@Service
public class ProductService {
    
    List<Product> products = Arrays.asList( 
        new Product(101,"Iphone",50000), 
        new Product(102, "Samsung",40000)
    );
    public List<Product> getProducts(){
        return products;
    }
}
