package com.app.FoodApp.dto.Repo.Control.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.FoodApp.dto.FoodOrder;
import com.app.FoodApp.dto.Repo.FoodOrderRepo;

@Repository
public class FoodOrderDao 
{
	@Autowired
	private FoodOrderRepo foodOrderRepo;
	
	public FoodOrder insertFoodOrderDao(FoodOrder foodorder)
	{
		return foodOrderRepo.save(foodorder);
	}
	
	public FoodOrder fetchbyid(int id)
	{
		
		foodOrderRepo.findById(id);
		return foodOrderRepo.findById(id).get();
	}
	
	public List<FoodOrder> fetchall(FoodOrder foodOrder)
	{
		return foodOrderRepo.findAll();
	}
	
}
