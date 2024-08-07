package Abstract;

abstract class HouseDoor {

	public abstract void open();
	// abstract method - does not have an implementation of housedoor class

	public void close() {
		System.out.println("Door is closed");
		// concrete method - have an implementation of housedoor class
	}
}

class House1 extends HouseDoor {
	@Override
	public void open() {
		System.out.println("House1 Door is Opened");
	}
}

class House2 extends HouseDoor {
	@Override
	public void open() {
		System.out.println("House2 Door is opened");
	}
}

public class House {

	public static void main(String[] args) {
		HouseDoor h1 = new House1();
		HouseDoor h2 = new House2();

		h1.open();
		h1.close();
		h2.open();
		h2.close();

	}

}
