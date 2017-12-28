package com.wly.simple_java;

public enum Color {
	RED(1), YELLOW(2), BLUE(3);
	private int value;
	private Color(int i){
		this.value = i;
	}
	
	public int getValue(){
		return this.value;
	}
}


class Test{
	public static void main(String[] args) {
		for (Color color : Color.values()) {
			System.out.println(color.getValue());
		}
	}
}