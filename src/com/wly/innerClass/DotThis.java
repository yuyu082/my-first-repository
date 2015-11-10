package com.wly.innerClass;

public class DotThis {
	void f(){
		System.out.println("DotThis.f()");
	}
	public class Inner{
		public DotThis outer(){
			return DotThis.this;	//和new DotThis()效果是一样的
		}
	}
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
	
}
