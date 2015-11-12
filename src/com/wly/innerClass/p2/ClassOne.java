package com.wly.innerClass.p2;

import com.wly.innerClass.p1.InterfaceOne;

public class ClassOne {
	protected class InnerCOne implements InterfaceOne{
		public InnerCOne() {
		}

		@Override
		public void methodOne() {
			System.out.println("I'm innerClass MethodOne.");
		}
		
		public void methodTwo(){
			System.out.println("I'm innerClass MethodTwo.");
		}
	}
	
	public InnerCOne innerCOne(){
		return new InnerCOne();
	}
}
