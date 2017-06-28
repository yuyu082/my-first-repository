package com.wly.pattern.factory;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory.smsSender().send();	
		SendFactory.mailSender().send();
	}
}
