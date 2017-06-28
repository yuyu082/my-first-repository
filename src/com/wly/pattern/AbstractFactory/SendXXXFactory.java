package com.wly.pattern.AbstractFactory;

public class SendXXXFactory implements Provider {

	@Override
	public Sender provider() {
		return new XXXSender();
	}

}
