package Devices;

public class TV implements device {

	@Override
	public void turnOn() {
		plugInPowerCord();
		System.out.println("TV has been turned on...");
	}

	@Override
	public void turnOff() {
		switchToFavoriteChannel();
		System.out.println("TV has been turned off...");
	}
	
	// Below is additional methods
	private void plugInPowerCord() {
		System.out.println("Power Cord has been plugged in.");
	}
	
	private void switchToFavoriteChannel() {
		System.out.println("Switched to favorite channel.");
	}
	
	@Override
	public String toString() {
		return "Television";
	}

}
