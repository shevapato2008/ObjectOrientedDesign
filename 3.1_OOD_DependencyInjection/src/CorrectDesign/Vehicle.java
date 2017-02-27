package CorrectDesign;

public class Vehicle {

	Engine myEngine;
	// Tire tire;
	// WindShield shield;
	// Roof roof;
	
	public Vehicle(Engine anEngine) {
		this.myEngine = anEngine;
	}
	
	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}
	
}
