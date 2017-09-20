package com.github.foreyer.core.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * HTML 对应类型
 * @author jameszhou
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FAnno {
	
	/**
	 * 字段Name
	 * @return
	 */
	String name() default "";
	/**
	 * type
	 * @return
	 */
	String type() default "text";
	/**
	 * 默认值
	 * @return
	 */
	String value() default "";
	/**
	 * 字段显示名称
	 * @return
	 */
	String label() default "";
	
	/**
	 * 初级验证 url,number,email,date 
	 * @return
	 */
	String vtype() default "";
}
