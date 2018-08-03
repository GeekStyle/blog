package com.geekstyle.blog.dao.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.geekstyle.blog.model.menu.Menu;

@Mapper
public interface MenuDao {
	
	@Select("select id,pid,name,url,icon,i18n_key i18nKey,create_time createTime from menu")
	public List<Menu> getAllMenu();
	
	@Select("select id,pid,name,url,icon,i18n_key i18nKey,create_time createTime from menu where pid != 0")
	public List<Menu> getAllSubMenu();
}
