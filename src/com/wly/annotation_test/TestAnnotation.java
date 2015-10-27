package com.wly.annotation_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAnnotation {
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);
	}
	
	public static void trackUseCases(List<Integer> useCases, Class<?> cl){
		Method[] methods = cl.getDeclaredMethods();
		for(Method m : methods){
			System.out.print(m.getName() + "  ");
		}
		System.out.println();
		for(Method m : methods){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null){
				System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for(int i :useCases){
			System.out.println("Warning: Missing use case:" + i);
		}
	}
}
