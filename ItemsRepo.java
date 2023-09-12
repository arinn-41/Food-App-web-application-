package com.app.FoodApp.dto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FoodApp.dto.Items;

public interface ItemsRepo extends JpaRepository<Items, Integer> {

}
