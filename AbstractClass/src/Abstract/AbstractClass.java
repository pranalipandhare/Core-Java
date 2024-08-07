package Abstract;

abstract class vehicle {
	// abstract method(does not have a body)
	public abstract void start();

	// concrete method
	public void stop() {
		System.out.println("The vehicle has stopped");
	}
}

class car extends vehicle {
	@Override

	public void start() {
		System.out.println("The car has started");
	}
}

class Bike extends vehicle {
	@Override
	public void start() {
		System.out.println("The Bike has started");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		vehicle myCar = new car();
		vehicle myBike = new Bike();

		myCar.start();
		// Output: The car has started
		myCar.stop();
		// output: The vehicle has stopped
		myBike.start();
		//// Output: The bike has started
		myBike.stop();
		// output: The vehicle has stopped
	}

}
