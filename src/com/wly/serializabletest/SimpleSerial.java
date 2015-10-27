package com.wly.serializabletest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerial {
	File file = new File("person.out");
	public static void main(String[] args) throws IOException{
		SimpleSerial serial = new SimpleSerial();
		serial.writeObject();
		serial.readObject();
	}
	
	public void writeObject() throws IOException{
		Person person = new Person("张三",20,Sex.man);
		if(!file.exists()){
			file.createNewFile();
		}
		ObjectOutputStream o_out = 
				new ObjectOutputStream(new FileOutputStream(file));
		o_out.writeObject(person);
		o_out.close();
	}
	
	private void readObject() throws IOException{
		ObjectInputStream o_in = 
				new ObjectInputStream(new FileInputStream(file));
		Object person2 = new Object();
		try {
			person2 = o_in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			o_in.close();
		}
		System.out.println(person2);
	}
}
