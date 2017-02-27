package BadDesign;

public class App {

	public static void main(String[] args) {
		Vehicle raceCar = new Vehicle();
		raceCar.crankIgnition();
		// Problem: Every time we instantiate a new vehicle, we create
		//          a large engine. We should make it more flexible.
	}

}
