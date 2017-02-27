package clients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vehicles.Vehicle;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
		aCar.crankIgnition();
			// If there are a lot of objects to be wired into the vehicle, this outsourcing of
			// dependency management to spring framework is much more convenient.
	}

}
