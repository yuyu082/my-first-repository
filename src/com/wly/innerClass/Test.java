package com.wly.innerClass;

public class Test {
	public static void main(String[] args) {
		TestOuter outer = new TestOuter();
		TestOuter.TestInner inner = outer.new TestInner();
		inner.p();
	}
}
