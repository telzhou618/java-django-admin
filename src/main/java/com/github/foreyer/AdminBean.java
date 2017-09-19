package com.github.foreyer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.foreyer.core.view.form.FormMap;
import com.github.foreyer.core.view.menu.Menu;
import com.github.foreyer.core.view.menu.MenuData;
import com.github.foreyer.entity.Test;
import com.github.foreyer.entity.User;
import com.google.common.collect.Lists;

/**
 * 初始化
 * @author jameszhou
 *
 */
@Configuration
public class AdminBean {
	/**
	 * 注入form组件
	 * @return
	 */
	@Bean
	public int createFormMap(){
		FormMap.bindModel(Test.class);
		FormMap.bindModel(User.class);
		return 1;
	}
	
	
	/**
	 * 注入菜单
	 * @return
	 */
	@Bean
	public MenuData initMenuMap(){
		MenuData md = new MenuData();
		md.put(new Menu("fa-cogs","系统管理",Lists.newArrayList(
				new Menu("/test/list","测试管理"),
				new Menu("/user/list","用户管理")
		)));
		
		md.put(new Menu("fa-cart-plus","商品管理",Lists.newArrayList(
				new Menu("/test/list","SPU管理"),
				new Menu("/user/list","类目管理")
		)));
		
		return md;
	}
}
