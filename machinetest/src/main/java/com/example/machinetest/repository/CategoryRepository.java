package com.example.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.machinetest.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
