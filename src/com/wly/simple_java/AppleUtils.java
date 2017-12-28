package com.wly.simple_java;

import java.util.List;

import com.wly.enumtest.IntTest.Apple;

public class AppleUtils {
	
	public static void prettyPrintApple(List<Apple> inventory, ???){
		for(Apple a : inventory){
			String output = ???.???(apple);
			System.out.println(output);
		}
	}

	
}


class Apple{
	
}

public interface AppleFormatter{
	String accept(Apple a);
}

