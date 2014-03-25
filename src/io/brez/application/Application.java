package io.brez.application;

public class Application {
	public boolean isWorking() {
		return !isBroken();
	}
	
	private boolean isBroken() {
		return false;
	}
}
