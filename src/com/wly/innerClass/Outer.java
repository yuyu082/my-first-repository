package com.wly.innerClass;

public class Outer {
	private String str;
	Outer(String str) {
		this.str = str;
	}
	class Inner{
		private int i = 1;
		public int getI(){
			return i;
		}
		public String toString(){
			return str;
		}
	}
	Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer("你好");
		Outer.Inner inner = outer.getInner();
		System.out.println(inner.getI());
		System.out.println(inner.toString());
	}
}
