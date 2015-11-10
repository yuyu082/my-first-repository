package com.wly.annotation_test.imooc;

@Description("I am a interface")
public interface Person {
	
	@Description("I am a interface method")
	public String name();
	
	public int age();
	
	@Deprecated
	public void sing();
}
