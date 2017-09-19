package com.github.foreyer.core.view.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuData {

	private List<Menu> menus =  new ArrayList<Menu>();

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void put(Menu menu){
		this.menus.add(menu);
	}
	
}
