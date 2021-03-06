package com.geekstyle.blog.controller.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekstyle.blog.model.menu.Menu;
import com.geekstyle.blog.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@GetMapping
	public ResponseEntity<?> getAllMenu() {
		List<Menu> menuList = menuService.getAllMenu();
		return ResponseEntity.status(HttpStatus.OK).body(menuList);
	}
	
	@GetMapping("/sub")
	public ResponseEntity<?> getAllSubMenu() {
		List<Menu> menuList = menuService.getAllSubMenu();
		return ResponseEntity.status(HttpStatus.OK).body(menuList);
	}
	
	@GetMapping("/main")
	public ResponseEntity<?> getAllMainMenu() {
		List<Menu> menuList = menuService.getAllMainMenu();
		return ResponseEntity.status(HttpStatus.OK).body(menuList);
	}
	
	
	
}
