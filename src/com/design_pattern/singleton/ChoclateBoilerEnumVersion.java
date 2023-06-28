package com.design_pattern.singleton;

public enum ChoclateBoilerEnumVersion {
	UNIQUE_INSTANCE;
	private boolean empty;
	private boolean boiled;
	private ChoclateBoilerEnumVersion() {
		empty=true;
		boiled=false;
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
