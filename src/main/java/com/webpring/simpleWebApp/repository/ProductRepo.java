package com.webpring.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webpring.simpleWebApp.model.Product;

// This is inbuilt, but we can make methods here as well. But without any implementation, JpaRepository provides us all CRUD operations
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
