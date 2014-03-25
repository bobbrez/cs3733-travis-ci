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
	
	public static void main(String [] args) {
		Application app = new Application();
		String text = app.isBroken() ? "BROKEN" : "Totally Fine!";
		System.out.println("This application is " + text);
	}
}
