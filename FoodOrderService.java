package com.app.FoodApp.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.FoodApp.dto.FoodOrder;
import com.app.FoodApp.dto.Items;
import com.app.FoodApp.dto.Repo.Control.Dao.FoodOrderDao;

@Service
public class FoodOrderService 
{
	@Autowired
	private FoodOrderDao dao;
	
	public FoodOrder insertFoodOrder(FoodOrder foodorder)
	{
		List<Items>list = foodorder.getItems();
		double totalprice1=0;
		for(Items items:list)
		{
			totalprice1=totalprice1+items.getItemprice()*items.getItemQuantity();
			
		}
		foodorder.setTotalPrice(totalprice1);
		return  dao.insertFoodOrderDao(foodorder);	
	}
	
	public FoodOrder fetchbyid(int id)
	{
		return dao.fetchbyid(id);
	}
	
	public List<FoodOrder> fetchall(FoodOrder foodOrder)
	{
		return dao.fetchall(foodOrder);
	}
	

}
