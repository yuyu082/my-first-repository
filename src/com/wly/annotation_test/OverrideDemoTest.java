package com.wly.annotation_test;

public class OverrideDemoTest extends Object{
	@Override
	public String toString(){
		return "测试注解";
	}
	
	public static void main(String[] args) {
		OverrideDemoTest t = new OverrideDemoTest();
		System.out.println(t.toString());
	}
}
