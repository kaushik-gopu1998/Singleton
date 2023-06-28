package com.design_pattern.singleton;

public class ChoclateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChoclateBoiler choclateBoiler;
	private ChoclateBoiler() {}

/*
 * one way of creating singleton object
 * drawbacks: not thread safe.
 * private static ChoclateBoiler choclateBoiler;
	public static ChoclateBoiler getInstace() {
		if(choclateBoiler==null) {
			choclateBoiler=new ChoclateBoiler();
		}
		return choclateBoiler;
	}
*/
/*
 *  private volatile static ChoclateBoiler choclateBoiler;
	public static ChoclateBoiler getInstance() {
		if(choclateBoiler==null) {
			synchronized (ChoclateBoiler.class){
				if(choclateBoiler==null) {
					choclateBoiler=new ChoclateBoiler();
				}
				
			}
		}
		return choclateBoiler;
	}
*/
	public static ChoclateBoiler getInstace() {
		if(choclateBoiler==null) {
			choclateBoiler=new ChoclateBoiler();
		}
		return choclateBoiler;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled=false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty=true;
		}
	}
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled=true;
		}
	}
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
}
