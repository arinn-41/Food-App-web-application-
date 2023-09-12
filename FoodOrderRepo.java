package com.app.FoodApp.dto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FoodApp.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer>{

}
