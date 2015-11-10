package com.wly.innerClass;

public class DotNew {
	public class Inner{
		public Inner(int a) {
			System.out.println("new的时候会调用构造方法吧~~  " + a);
		}
		public void t(){
			System.out.println("haha");
		}
	}
	public static void main(String[] args) {
		DotNew dotNew = new DotNew();
		DotNew.Inner inner = dotNew.new Inner(1);
		inner.t();
	}
}
