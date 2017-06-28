package com.wly.pattern.AbstractFactory;

public class SendMailFactory implements Provider {

	@Override
	public Sender provider() {
		return new MailSender();
	}

}
