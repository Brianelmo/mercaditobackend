package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entities.Product;

public interface ProductRepositorie extends JpaRepository<Product, Integer> {

    
}
