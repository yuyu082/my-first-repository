package com.wly.ThreadTest;

public class MyThread extends Thread{
	private int tickets = 100;
	
	public void run(){
		while(tickets > 0){
			System.out.println(this.getName()+" - 剩余票数为：" + tickets--);
		}
	}
}
