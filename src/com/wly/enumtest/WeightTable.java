package com.wly.enumtest;

public class WeightTable {
	public static void main(String[] args) {
		double eartWeight = Double.parseDouble("123");
		double mass = eartWeight / Planet.EARTH.surfaceGravity();
		for(Planet p : Planet.values()){
			System.out.println("Weight on "+ p +" is "+ p.surfaceWeight(mass));
		}
		
		for(Planet p : Planet.values()){
			System.out.print(p + "  ");
		}
	}
}
