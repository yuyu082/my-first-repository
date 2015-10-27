package com.wly.enumtest;

public class OperationTest {
	public static void main(String[] args) {
		double x = 2.0000;
		double y = 2.0000;
		for(Operation op : Operation.values()){
//			System.out.println(x + " "+ op + " " + y + " = " +op.apply(x, y));
			System.out.println(op.apply(x, y));
		}
	}

}
