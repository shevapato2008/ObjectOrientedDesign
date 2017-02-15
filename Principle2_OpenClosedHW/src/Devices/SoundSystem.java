package Devices;

public class SoundSystem implements device {

	@Override
	public void turnOn() {
		switchToFavoriteChannel();
		increaseVolume();
		System.out.println("Sound system has been turned on...");
	}

	@Override
	public void turnOff() {
		lowerVolume();
		System.out.println("Sound System has been turned off...");
	}
	
	// below are additional methods
	private void switchToFavoriteChannel() {
		System.out.println("Volume has increased to a comfortable level on startup");
	}
	
	private void increaseVolume() {
		System.out.println("Increase the volume.");
	}
	
	private void lowerVolume() {
		System.out.println("Lower the volume.");
	}
	
	@Override
	public String toString() {
		return "Sound System";
	}

}
