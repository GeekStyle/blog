package com.geekstyle.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekstyle.blog.dao.menu.MenuDao;
import com.geekstyle.blog.model.menu.Menu;
import com.geekstyle.blog.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuDao menuDao;
	
	@Override
	public List<Menu> getAllMenu() {
		List<Menu> resultMenuList = new ArrayList<Menu>();
		List<Menu> menuList = menuDao.getAllMenu();
		for(Menu menu : menuList) {
			if(menu.getPid() == 0) {
				for(Menu subMenu : menuList) {
					if(subMenu.getPid() == menu.getId()) {
						menu.getSubMenuList().add(subMenu);
					}
				}
				resultMenuList.add(menu);
			}
		}
		return resultMenuList;
	}

}
