package com.geekstyle.blog.service;

import java.util.List;

import com.geekstyle.blog.model.menu.Menu;

public interface MenuService {
	
	public List<Menu> getAllMenu();
	
	public List<Menu> getAllSubMenu();
	
}
