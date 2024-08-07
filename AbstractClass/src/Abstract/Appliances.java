package Abstract;

abstract class appliance {
	public abstract void turnOn();
	// Abstract method - no body, no implementation, inherits by all subclasses

	public void turnOff() {
		System.out.println("Appliances are Turned off");
	}
}

class Microwave extends appliance {
	@Override

	public void turnOn() {
		System.out.println("Microwave us Turned on ");
	}
}

class WashingMachine extends appliance {
	@Override

	public void turnOn() {
		System.out.println("WashingMachine is Turned On ");
	}
}

class Fridge extends appliance {
	@Override

	public void turnOn() {
		System.out.println("Fridge is Turned On ");
	}
}

class Dryer extends appliance {
	@Override

	public void turnOn() {
		System.out.println("Dryer is Turned On ");
	}
}

public class Appliances {

	public static void main(String[] args) {
		appliance a1 = new Microwave();
		appliance a2 = new WashingMachine();
		appliance a3 = new Fridge();
		appliance a4 = new Dryer();

		a1.turnOff();
		a1.turnOn();
		System.out.println();
		a2.turnOff();
		a2.turnOn();
		System.out.println();
		a3.turnOff();
		a3.turnOn();
		System.out.println();
		a4.turnOff();
		a4.turnOn();

	}

}
