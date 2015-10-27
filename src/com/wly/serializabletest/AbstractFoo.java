package com.wly.serializabletest;

import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractFoo {
	private int x,y;
	
	private enum State{
		NEW,INITIALIZING,INITIALIZED;
	}
	
	private final AtomicReference<State> init = new AtomicReference<State>(State.NEW);
	
	public AbstractFoo(int x,int y){
		initialize(x,y);
	}
	
	protected AbstractFoo(){}
	
	protected final void initialize(int x, int y){
		if(!init.compareAndSet(State.NEW, State.INITIALIZING)){
			throw new IllegalStateException("Already initialize");
		}
		this.x = x;
		this.y = y;
		init.set(State.INITIALIZED);
	}
	
	protected final int getx(){
		checkInit();
		return x;
	}
	
	protected final int gety(){
		checkInit();
		return y;
	}
	
	private void checkInit(){
		if(init.get() != State.INITIALIZED){
			throw new IllegalStateException("Uninitialized");
		}
	}
}
