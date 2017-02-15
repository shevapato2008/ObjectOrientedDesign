package Remotes;

import Devices.device;

public class RemoteControl {
	
	private device device = null;
	// Only one object instantiated within the class
	private static final RemoteControl INSTANCE = new RemoteControl();
	
	// set contructor as private so that client cannot instantiate it
	private RemoteControl() {
		
	}
	
	// Make this getInstance static method so that it 
	// can not be instantiated outside. Because we want
	// to have only one remote control...
	public static RemoteControl getInstance() {
		return INSTANCE;
	}
	
	public void connectToDevice(device aDevice) {
		this.device = aDevice;
		System.out.println("---- Remote is connected to " + device + " ----");
	}
	
	public void clickOffButton() {
		device.turnOff();
	}
	
	public void clickOnButton() {
		device.turnOn();
	}
	
}
