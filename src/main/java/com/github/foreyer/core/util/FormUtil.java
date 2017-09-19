package com.github.foreyer.core.util;

import java.util.List;

import com.github.foreyer.core.view.form.Form;
import com.github.foreyer.core.view.form.FormField;

public class FormUtil {

	public static Form toForm(Class<?> modelClass,String modelName,String modelLabel) {
		// TODO Auto-generated method stub
		Form form= new Form();
		form.setModelName(modelName);
		form.setModelLabel(modelLabel);
		List<FormField> superFieldList = FieldUtil.toFormFiels(modelClass.getSuperclass());
		List<FormField> selfFieldList = FieldUtil.toFormFiels(modelClass);
		superFieldList.addAll(selfFieldList); //两个List相加
		form.setFormFields(superFieldList);
		return form;
	}

}
