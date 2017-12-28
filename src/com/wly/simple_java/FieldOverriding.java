package com.wly.simple_java;


class Super{
	String s = "super";
//	public Super(){
////		System.out.println("Super");
//	}
//	public Super(String s){
////		System.out.println("Super---");
//	}
}

class Sub extends Super {
	String s = "sub";
//	public Sub(){
////		super("");
////		System.out.println("Sub");
//	}
}

public class FieldOverriding {
	public static void main(String[] args) {
		Sub sb = new Sub();
		System.out.println(sb.s);
		
		Super sp = new Sub();
		System.out.println(sp.s);
	}
}
