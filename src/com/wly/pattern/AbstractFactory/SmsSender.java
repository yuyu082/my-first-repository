package com.wly.pattern.AbstractFactory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("-------------smsSender-------------");
	}

}
