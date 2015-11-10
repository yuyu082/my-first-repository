package com.wly.annotation_test.imooc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {
	
/*	String desc(); //成员只能无参，无异常
	
	String author(); 
	
//	Map<String, String> t(); 成员类型受限
	
	int age() default 18;  //可以有默认值
*/
	String value();
}
