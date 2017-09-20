package com.github.foreyer.core.view.form;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.github.foreyer.core.util.FormUtil;

/**
 * 存储表单
 * @author jameszhou
 *
 */
public class FormMap {
	
	private static Map<String,Form> map = new TreeMap<String,Form>();
	
	public  void addForm(String key,Form form){
		map.put(key,form);
	}
	
	public  Form getForm(String key){
		return map.get(key);
	}
	
	public  Collection<Form> getForms(){
	
		return map.values();
	}
	
	/**
	 * 绑定一个Model 指定ModelName
	 * @param clazz
	 */
	public  void bindModel(Class<?> modelClass,String modelName,String modelLabel){
		
		String key = modelClass.getSimpleName();
		Form form =  FormUtil.toForm(modelClass,modelName,modelLabel);
		map.put(key, form);
	}
	
	/**
	 * 绑定一个Model,默认的modelName为simpleName 小写,默认modelLabel是simpleName大写
	 * @param clazz
	 */
	public  void bindModel(Class<?> modelClass){
		
		String key = modelClass.getSimpleName();
		
		Form form =  FormUtil.toForm(modelClass,modelClass.getSimpleName().toLowerCase(),
				modelClass.getSimpleName());
		map.put(key, form);
	}
	
	
	
}
