package com.wly.pattern.AbstractFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("-------------mailSender------------");
	}

}
