package com.app.FoodApp.dto.Repo.Control.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.FoodApp.dto.Menu;
import com.app.FoodApp.dto.Product;
import com.app.FoodApp.dto.Repo.MenuRepo;



@Repository
public class MenuDao 
{
	@Autowired
	private MenuRepo menuRepo;
	
	
	public Menu saveMenu(Menu menu)
	{
		return menuRepo.save(menu);
	}
	
	public List<Menu> fetchallmenu(Menu menu)
	{
		return menuRepo.findAll();
	}
	
	public Menu updateMenu(int id,Menu menu)
	{
		menu.setMenuId(id);
		menu.setProducts(menu.getProducts());
		return menuRepo.save(menu);
	}
	
	public Menu fetchbyid(int id)
	{
		menuRepo.findById(id);
		
		return menuRepo.findById(id).get();
	}
}
