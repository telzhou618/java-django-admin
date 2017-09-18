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
	
	String name() default "";
	
	String type() default "text";
	
	String value() default "";
	
	String label() default "";
}
