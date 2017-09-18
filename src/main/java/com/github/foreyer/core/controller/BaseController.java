package com.github.foreyer.core.controller;

/**
 * Rest CRUD 超级控制器,目的在于所有继承该控制器的子控制器自带标准的5个Rest接口,包含CRUD
 * Created by Gaojun.Zhou 2017年6月8日
 * 
 * T 表示要操作的实体,实现序列化接口Serializable
 * S 表示调用对象的服务层接口,一班情况下要求存在
 * 
 */
public abstract class BaseController {

	/**
	 * 默认视图路径
	 * @return
	 */
	public String getView(){
		return "default";
	}
	
	/**
	 * 重定向
	 * @param url
	 * @return
	 */
	public String redirectUrl(String url){
		return "redirect:" + url;
	}
}
