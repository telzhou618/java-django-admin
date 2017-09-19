package com.github.foreyer.core.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.github.foreyer.core.anno.FAnno;
import com.github.foreyer.core.view.form.FormField;

public class FieldUtil {

	/**
	 * 解析Model的字段
	 * @param modelClass
	 * @return
	 */
	public static List<FormField> toFormFiels(Class<?> modelClass) {
		// TODO Auto-generated method stub
		List<FormField> list = new ArrayList<FormField>();
		
		Field[] fields = modelClass.getDeclaredFields();
		for(Field field : fields){
			
			if(field.getName().equals("serialVersionUID")){
				continue;
			}
			
			FormField fd = new FormField();
			
			FAnno fAnno = field.getAnnotation(FAnno.class);
			
			if(fAnno != null){
				fd.setId(field.getName());
				fd.setName(StringUtils.isNotBlank(fAnno.name())?fAnno.name():field.getName());
				fd.setLabel((StringUtils.isNotBlank(fAnno.label()))? fAnno.label():field.getName());
				fd.setType((StringUtils.isNotBlank(fAnno.type()))?fAnno.type():"text");
				fd.setValue((StringUtils.isNotBlank(fAnno.value()))?fAnno.value():"");
				//解析select
				//解析 validate
			}else{
				fd.setId(field.getName());
				fd.setLabel(field.getName());
				fd.setName(field.getName());
				fd.setType("text");
			}
			
			list.add(fd);
		}
		
		return list;
	}

}
