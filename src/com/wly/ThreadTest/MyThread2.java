package com.wly.ThreadTest;

import java.io.IOException;
import java.nio.CharBuffer;

public class MyThread2 implements Readable{
	private int tickets = 100;
	
	public void run(){
		while(tickets > 0){
			System.out.println(Thread.currentThread().getName()+" - 剩余票数为：" + tickets--);
		}
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
}
