package com.wly.innerClass;

class Parcel4 {
	private class PContents implements Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected class pDestination implements Destination{
		private String label;
		private pDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Destination destination(String s){
		return new pDestination(s);
	}
	
	public Contents contents(){
		return new PContents();
	}
}
