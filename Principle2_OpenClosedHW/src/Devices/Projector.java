package Devices;

public class Projector implements device {

	@Override
	public void turnOn() {
		pullUpScreen();
		System.out.println("Projector has been turned on...");
	}

	@Override
	public void turnOff() {
		pullDownScreen();
		System.out.println("Projector has been turned off...");
	}
	
	public void pullUpScreen() {
		System.out.println("Projector screen has been pulled up...");
	}
	
	public void pullDownScreen() {
		System.out.println("Projector screen has been pulled down...");
	}

	@Override
	public String toString() {
		return "Projector";
	}
	
}
