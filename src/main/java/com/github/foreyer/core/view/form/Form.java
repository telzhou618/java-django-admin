package com.github.foreyer.core.view.form;

import java.util.List;

/**
 * 表单
 * @author jameszhou
 *
 */
public class Form {	
	/**
	 * 模块显示名称
	 */
	private String modelLabel;
	/**
	 * 模块名称
	 */
	private String modelName;
	
	/**
	 * 表单字段
	 */
	List<FormField> formFields;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public List<FormField> getFormFields() {
		return formFields;
	}

	public void setFormFields(List<FormField> formFields) {
		this.formFields = formFields;
	}

	public String getModelLabel() {
		return modelLabel;
	}

	public void setModelLabel(String modelLabel) {
		this.modelLabel = modelLabel;
	}
}
