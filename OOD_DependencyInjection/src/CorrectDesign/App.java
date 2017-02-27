package CorrectDesign;

public class App {

	public static void main(String[] args) {
		Vehicle raceCar = new Vehicle(new SmallEngine(100));
			// This is the dependency injection.
			// We create a vehicle with a small engine injected.
			// We could have more stuff to inject. E.g. tire, windshield, roof, and so on.
		
		raceCar.crankIgnition();
	}

}
