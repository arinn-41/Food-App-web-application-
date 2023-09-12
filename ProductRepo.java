package com.app.FoodApp.dto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FoodApp.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
