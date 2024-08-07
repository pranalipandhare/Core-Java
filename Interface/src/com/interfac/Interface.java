 package com.interfac;

interface Animal {
	void makeSound();
	//abstract method - No body, no implementation, inherit by all classes
}

class Dog implements Animal {
	@Override
	
	public void makeSound() {
		System.out.println("Bhohh-Bhoohh");
	}
}

class cat implements Animal {
	@Override
	
	public void makeSound() {
		System.out.println("Meow");
	}
}

class Lion implements Animal{
	@Override
	
	public void makeSound() {
		System.out.println("Ghurrrr");
	}
}

public class Interface {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new cat();
		Animal Lion = new Lion();

		dog.makeSound();
//		output: woof
		
		System.out.println();
		
		cat.makeSound();
//		output meow
	
		System.out.println();
		
		Lion.makeSound();

	}

}
