package com.wly.annotation_test.imooc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PareAnn {
	public static void main(String[] args) {
//		1、使用类加载器加载类
		try {
			Class<?> c = Class.forName("com.wly.annotation_test.imooc.Child");
//			2、找到类上面的注解
			boolean isExist = c.isAnnotationPresent(Description.class);//判断是否存在这样的注解
			if(isExist){
//				3、拿到注解实例
				Description d = (Description) c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
			
			System.out.println("-----华丽丽的分割线-----");
			
			Method[] methods = c.getMethods();
			for(Method m : methods){
				boolean isExistMethodAnn = m.isAnnotationPresent(Description.class);
				if(isExistMethodAnn){
					Description md = m.getAnnotation(Description.class);
					System.out.println(md.value());
				}
			}
			
			System.out.println("-----另一种解析方式------");
			for(Method m : methods){
				Annotation[] annotations = m.getAnnotations();
				for(Annotation a : annotations){
					if(a instanceof Description){
						Description d = (Description)a;
						System.out.println("Description:"+d.value());
						System.out.println(a.toString());
					}else{
						System.out.println(a.toString());
					}
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
