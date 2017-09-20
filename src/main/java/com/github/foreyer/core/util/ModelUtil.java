package com.github.foreyer.core.util;

import java.util.ArrayList;
import java.util.List;

import com.github.foreyer.core.view.menu.Menu;

public class ModelUtil {

	/**
	 * 将模型转换为菜单对象
	 * @param class1
	 * @return
	 */
	public static Menu toMenu(Class class1) {
		// TODO Auto-generated method stub
		return new Menu("/"+class1.getSimpleName().toLowerCase() + "/list",class1.getSimpleName());
	}

	
	public static List<Menu> toMenus(Class...classes) {
		// TODO Auto-generated method stub
		
		List<Menu> list = new ArrayList<>();
		
		for(Class<?>  clszz : classes){
			list.add(toMenu(clszz));
		}
		
		return list;
	}
}
