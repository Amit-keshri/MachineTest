package com.example.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.machinetest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
