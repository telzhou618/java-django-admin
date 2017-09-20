package com.github.foreyer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.foreyer.core.util.ModelUtil;
import com.github.foreyer.core.view.form.FormMap;
import com.github.foreyer.core.view.menu.Menu;
import com.github.foreyer.core.view.menu.MenuData;
import com.github.foreyer.entity.Test;
import com.github.foreyer.entity.User;

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
	public FormMap initFormMap(){
		FormMap fm = new FormMap();
		fm.bindModel(Test.class);
		fm.bindModel(User.class);
		return fm;
	}
	
	
	/**
	 * 注入菜单
	 * @return
	 */
	@Bean
	public MenuData initMenuMap(){
		MenuData md = new MenuData();
		md.put(new Menu("fa-cogs","System",ModelUtil.toMenus(User.class,Test.class)));
		md.put(new Menu("fa-cart-plus","Goods",ModelUtil.toMenus(User.class,Test.class)));
		return md;
	}
}
