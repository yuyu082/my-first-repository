package com.wly.innerClass.p3;

import com.wly.innerClass.p1.InterfaceOne;
import com.wly.innerClass.p2.ClassOne;

public class ClassTwo extends ClassOne{
	public InterfaceOne getInner(){
		ClassOne one = new ClassOne();
		InterfaceOne interfaceOne = one.new InnerCOne();
		interfaceOne.methodOne();
		return interfaceOne;
	}
	
	public static void main(String[] args) {
		ClassTwo classTwo = new ClassTwo();
		InnerCOne innerCOne = classTwo.innerCOne();
		innerCOne.methodTwo();
		innerCOne.methodOne();
	}
}
