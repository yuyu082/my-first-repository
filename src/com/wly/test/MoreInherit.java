package com.wly.test;

public class MoreInherit implements MoreInherit1, MoreInherit2{

	public static void main(String[] args) {
		MoreInherit m = new MoreInherit();
		m.test();
	}

	@Override
	public void test() {
		MoreInherit2.super.test();
	}
	
}
