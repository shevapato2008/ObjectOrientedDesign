package vehicles;
import parts.Engine;

public class Vehicle {

	private Engine myEngine;
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
