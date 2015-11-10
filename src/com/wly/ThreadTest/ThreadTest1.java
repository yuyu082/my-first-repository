package com.wly.ThreadTest;

public class ThreadTest1 {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		new MyThread().start();
		new MyThread().start();
	}
}
