package io.brez.application;

public class Application {
	boolean DEMO_MODE = false;
	boolean BROKEN = false;
	
	public String name() {
		return "My App";
	}
	
	public boolean isWorking() {
		return isDemoMode() && !isBroken();
	}
	
	private boolean isBroken() {
		return BROKEN;
	}
	
	private boolean isDemoMode() {
		return DEMO_MODE;
	}
}
