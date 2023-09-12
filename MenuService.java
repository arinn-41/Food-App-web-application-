package com.app.FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.FoodApp.dto.Menu;
import com.app.FoodApp.dto.Repo.Control.Dao.MenuDao;

@Service
public class MenuService {
	@Autowired
	private MenuDao menuDao;

	public Menu saveMenu(Menu menu) {
		return menuDao.saveMenu(menu);
	}

	public List<Menu> fetchall(Menu menu) {
		return menuDao.fetchallmenu(menu);
	}

	public Menu updateMenu(int id, Menu menu) {
		return menuDao.updateMenu(id, menu);
	}
	
	public Menu fetchbyid(int id)
	{
		return menuDao.fetchbyid(id);
	}
}
