package com.wly.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)	//该注解可作用与方法
@Retention(RetentionPolicy.RUNTIME) //保存策略，虚拟机运行时保留该注解
public @interface UseCase {
	public int id() default 1;
	public String description() default "这是默认描述";
}
