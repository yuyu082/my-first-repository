package com.wly.pattern.factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("smsSender...");
	}

}
