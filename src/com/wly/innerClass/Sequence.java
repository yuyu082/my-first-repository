package com.wly.innerClass;

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size){
		items = new Object[size];
	}
	public void add(Object x){
		if(next < items.length){
			items[next++] = x;
		}
	}
	public Object[] getObjects(){
		return items;
	}
	
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length){
				i++;
			}
		}
	}
	
	public class StringObj {
		private String str;
		public StringObj(int i){
			str = String.valueOf(i);
		}
		public String toString(){
			return str;
		}
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
	
	public StringObj getStringObj(int i){
		return new StringObj(i);
	}
	
	public static void main(String[] args) {
		/*Sequence sequence = new Sequence(10);
		for(int i=0; i<10; i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current() + " ");
			selector.next();
		}*/
		
		Sequence sequence = new Sequence(10);
		for(int i = 0 ; i < 10 ; i++){
			sequence.add(sequence.getStringObj(i));
		}
		Object[] os = sequence.getObjects();
		for(int i = 0 ; i < os.length ; i++){
			Sequence.StringObj sObj = (StringObj) os[i];
			System.out.print(sObj.toString() + " ");
		}
	}
	
}
