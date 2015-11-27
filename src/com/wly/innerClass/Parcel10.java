package com.wly.innerClass;

public class Parcel10 {
	public Destination destination(final String dest, final float price){
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100){
					System.out.println("cost 大于 100 :" + cost);
				}
			}
			
			private String lable = dest;
			@Override
			public String readLabel() {
				return lable;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("yo~~heheheheh~~~~", 101.11F);
		System.out.println(d.readLabel());
	}
}
