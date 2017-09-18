package com.github.foreyer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.github.foreyer.core.view.FormMap;
import com.github.foreyer.entity.Test;
import com.github.foreyer.entity.User;

/**
 * 初始化
 * @author jameszhou
 *
 */
@Component
public class AdminForm {
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
}
