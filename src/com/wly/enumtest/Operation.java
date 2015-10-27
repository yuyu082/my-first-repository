package com.wly.enumtest;

public enum Operation {
	/*PLUS, MINUS, TIMES, DIVIED;
	
	double apply(double x, double y){
		switch (this) {
			case PLUS: return x + y;
			case MINUS: return x - y;
			case TIMES: return x * y;
			case DIVIED: return x/y;
		}
		throw new AssertionError("Unknown op: " + this);
	}*/
	
	PLUS("+"){
		double apply(double x, double y){ return x + y; }
	},
	MINUS("-"){
		double apply(double x, double y){ return x - y; }
	},
	TIMES("*"){
		double apply(double x, double y){ return x * y; }
	},
	DICIDE("/"){
		double apply(double x, double y){ return x / y; }
	};
	
	private final String symbol;
	Operation(String symbol){
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return symbol;
	}
	
	abstract double apply(double x, double y);
}
