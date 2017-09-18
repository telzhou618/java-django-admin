package com.github.foreyer.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;
import com.github.foreyer.core.anno.FAnno;
import com.github.foreyer.core.model.Model;

@TableName("tb_test")
public class Test extends Model{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@FAnno(type="text")
	private String name;
	
	@FAnno("0")
	private int age;
	
	@FAnno(type="date")
	private Date birth;
	
	@FAnno(type="number")
	private int state;
	
	@FAnno(type="file")
	private String file;
	
	private Float price;
	
	@FAnno(type="textarea")
	private String textDesc;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTextDesc() {
		return textDesc;
	}

	public void setTextDesc(String textDesc) {
		this.textDesc = textDesc;
	}
	
}
