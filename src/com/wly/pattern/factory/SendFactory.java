package com.wly.pattern.factory;

/**
 * 静态工厂（使用时直接调用）
 * @author ly
 */
public class SendFactory {

	public static Sender smsSender(){
		Sender sender = new SmsSender();
		return sender;
	}
	
	public static Sender mailSender(){
		Sender sender = new MailSender();
		return sender;
	}
	
}
