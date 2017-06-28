package com.wly.pattern.AbstractFactory;

public class AbsFactoryTest {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		provider.provider().send();
		
		Provider provider2 = new SendSmsFactory();
		provider2.provider().send();
		
		Provider provider3 = new SendXXXFactory();
		provider3.provider().send();
	}
}
