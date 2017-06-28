package com.wly.simple_java;

public class FieldOverriding {
	public static void main(String[] args) {
		Super sp = new Super();
		Sub sb = new Sub();
		System.out.println(sp.s);
		System.out.println(sb.s);
	}
}


class Super{
	String s = "super";
}

class Sub extends Super{
	String s = "sub";
}