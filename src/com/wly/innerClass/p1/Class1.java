package com.wly.innerClass.p1;

public class Class1 {
	public InterfaceOne t(){
		class Inner1 implements InterfaceOne{
			@Override
			public void methodOne() {
			}
		}
		return new Inner1();
	}
	
	public InterfaceOne t2(){
		InterfaceOne interfaceOne;
		if(true){
			class Inner2 implements InterfaceOne{
				@Override
				public void methodOne() {
				}
			}
			interfaceOne = new Inner2();
		}
		return interfaceOne;
	}
}
