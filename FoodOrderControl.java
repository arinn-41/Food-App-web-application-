package com.app.FoodApp.dto.Repo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.FoodApp.dto.FoodOrder;
import com.app.FoodApp.service.FoodOrderService;

@RestController
public class FoodOrderControl 
{
	@Autowired
	private FoodOrderService foodOrderService;
	
	@PostMapping("/insertFoodOrder")
	public FoodOrder insertFoodOrder(@Validated @RequestBody FoodOrder foodorder)
	{
		return foodOrderService.insertFoodOrder(foodorder);
	}
	
	@GetMapping("/fetchbyidfoodorder")
	public FoodOrder fetchbyid(@RequestParam int id)
	{
		return foodOrderService.fetchbyid(id);
	}
	
	@GetMapping("/fetchallfo")
	public List<FoodOrder> fetchall(FoodOrder foodOrder)
	{
		return foodOrderService.fetchall(foodOrder);
	}
	

}
