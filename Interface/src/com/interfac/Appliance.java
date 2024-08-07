package com.interfac;

interface appliances {
	void turnOff();

}

class WashingMachine implements appliances {

	@Override
	public void turnOff() {
		System.out.println("WashingMachine is off Now");

	}
}

class Microwave implements appliances {

	@Override
	public void turnOff() {
		System.out.println("Microwave is off Now");

	}

}

public class Appliance {

	public static void main(String[] args) {
		
		appliances a = new WashingMachine();
		appliances aa = new Microwave();
		
		a.turnOff();
		aa.turnOff();
	}

}
