package com.app.FoodApp.dto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FoodApp.dto.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer> {

}
