
public class Zoo {

	public static void main(String[] args) {
		
		Animal sparrow1 = new Sparrow(3, "F", 10);
		sparrow1.eat();
		sparrow1.sleep();
		//sparrow1.move();
		
		Animal fish1 = new Fish(1, "M", 2);
		//fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);
		
		Flyable flyingBird1 = new Sparrow(1, "M", 4);
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}

}
