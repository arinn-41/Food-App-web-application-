package com.app.FoodApp.dto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FoodApp.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> 
{
	
	

}
