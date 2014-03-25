package io.brez.application;

public class Application {
	boolean DEMO_MODE = true;
	
	public String name() {
		return "My App";
	}
	
	public boolean isWorking() {
		return isDemoMode() && !isBroken();
	}
	
	private boolean isBroken() {
		return true;
	}
	
	private boolean isDemoMode() {
		return DEMO_MODE;
	}
}
