package com.github.foreyer.core.view;

import com.github.foreyer.core.validate.Validate;

public class FormField {

	/**
	 * 字段ID
	 */
	private String id;
	/**
	 * 字段类型
	 */
	public String type = "text";
	/**
	 * 默认值
	 */
	private String value = "";
	
	/**
	 * 字段验证
	 */
	private Validate validate;
	
	/**
	 * 字段名称
	 */
	private String label;
	
	/**
	 * 字段名称
	 */
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Validate getValidate() {
		return validate;
	}

	public void setValidate(Validate validate) {
		this.validate = validate;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
