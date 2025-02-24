package com.webpring.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webpring.simpleWebApp.model.Product;
import com.webpring.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //         new Product(101, "Iphone", 50000),
    //         new Product(102, "Samsung", 40000)));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int prodId){
        // return products.stream()
        // .filter(p -> p.getProdId() == prodId) // Lambda Expression (Arrow function like JavaScript) -> filter will check condition and return true or false
        // .findFirst().orElse(new Product(100, "No Item", 0));
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
        // products.add(product);
        productRepo.save(product);
    }

    public void updateProduct(Product product){

        // int index = 0;
        // for(int i = 0; i < products.size(); i++){
        //     if(products.get(i).getProdId() == product.getProdId()){
        //         index = i;
        //     }
        // }
        // products.set(index, product);

        productRepo.save(product);
    }

    // This logic is not effecient as this code is for learning purpose of Spring Boot
    public void deleteProductByID(int prodId){
        // int index = 0;
        // for(int i = 0; i < products.size(); i++){
        //     if(products.get(i).getProdId() == prodId){
        //         index = i;
        //     }
        // }
        // products.remove(index);
        productRepo.deleteById(prodId);
    }
}
