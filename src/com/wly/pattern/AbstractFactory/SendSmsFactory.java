package com.wly.pattern.AbstractFactory;

public class SendSmsFactory implements Provider{

	@Override
	public Sender provider() {
		return new SmsSender();
	}

}
