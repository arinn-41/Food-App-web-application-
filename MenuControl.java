package com.app.FoodApp.dto.Repo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.FoodApp.dto.Menu;
import com.app.FoodApp.service.MenuService;

@RestController
public class MenuControl 
{
	@Autowired
	private MenuService menuService;
	
	@PostMapping("/saveMenu")
	public Menu saveMenu(@RequestBody Menu menu)
	{
		return menuService.saveMenu(menu);
	}
	
	@GetMapping("/fetchallmenu")
	public List<Menu> fetchallmenu(Menu menu)
	{
		return menuService.fetchall(menu);
	}
	
	@PutMapping("/updateMenu")
	public  Menu updateMenu(@RequestParam int id,@RequestBody Menu menu)
	{
		
		return menuService.updateMenu(id, menu);	
	}
	
	@GetMapping("/fetchbyidmenu")
	public Menu fetchbyid(@RequestParam int id)
	{
		return menuService.fetchbyid(id);
	}
}
