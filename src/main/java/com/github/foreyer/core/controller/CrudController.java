package com.github.foreyer.core.controller;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.github.foreyer.core.view.form.Form;
import com.github.foreyer.core.view.form.FormMap;

/**
 * Rest CRUD 超级控制器,目的在于所有继承该控制器的子控制器自带标准的5个Rest接口,包含CRUD
 * Created by Gaojun.Zhou 2017年6月8日
 * 
 * T 表示要操作的实体,实现序列化接口Serializable
 * S 表示调用对象的服务层接口,一班情况下要求存在
 * 
 */
public abstract class CrudController<T extends Serializable,S extends IService<T>> extends BaseController{

	/**
	 * 注入服务层
	 */
	@Autowired(required = false) private S s;
	@Autowired private FormMap formMap;
	
	public S getS() {
		return s;
	}

	/**
	 * 
	 * @return
	 */
    @RequestMapping("/list")
    public  String list(Model model){
		List<T> list = s.selectList(null); //查询所有对象,null表示没有条件,会返回所有对象,Mybatis-Plus的特性
		model.addAttribute("list", list);
		return this.getView()+"/list";
    }
	
    @RequestMapping("/update/{id}")  
    public  String update(@PathVariable("id") Serializable id,Model model){
		T t = s.selectById(id);
		model.addAttribute("t", t);
		return this.getView()+"/update";
    }
    
    @RequestMapping("/doUpdate")  
    public  String doUpdate(@Valid T t,BindingResult result,Model model){
    	if(result.hasErrors()){
			model.addAttribute("errors",result.getFieldErrors());
			model.addAttribute("t", t);
			return getView() + "/update";
		}
		s.updateById(t);
		return this.redirectUrl("/"+getModelName()+"/list");
    }
    
    /**
     * 创建对象
     * @param t
     * @param result
     * @return
     */
    @RequestMapping("/add")
	public String add(Model model){
    	return getView() + "/add";
	}
    
	/**
	 * 执行创建对象
	 * @param t
	 * @param result 验证器，和Mode层配合使用
	 * @return
	 */
	@RequestMapping("/doAdd")
	public String doAdd(@Valid T t,BindingResult result,Model model){
		
		if(result.hasErrors()){
			model.addAttribute("errors",result.getFieldErrors());
			return getView() + "/add";
		}
		s.insert(t);
		return this.redirectUrl("/"+getModelName()+"/list");
	}
	
	
	/**
	 * 删除对象
	 * @param id
	 * @return
	 */
	@RequestMapping("/del/{id}")
	public String delete(@PathVariable("id") Serializable id){
    	s.deleteById(id);
    	return this.redirectUrl("/"+getModelName()+"/list");
	}
	
	/**
	 * 获取当前Model
	 * @return
	 */
	private String getModelName(){
		
		Type type = this.getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) type;
		Type[] ts = pt.getActualTypeArguments(); //泛型中的参数
		Class<?> c = (Class<?>) ts[0]; //第一个参数
		Form form = formMap.getForm(c.getSimpleName());
		return form.getModelName();
	}
}
