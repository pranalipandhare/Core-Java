package com.interfac;

interface Shape {
	void shapeName();
	
	default void Display() {
		System.out.println("This is a Shape");
	}
}

class Circle implements Shape {
	@Override

	public void shapeName() {
		System.out.println("Shape is Circle");
	}
}

class Rectangular implements Shape {
	@Override
	public void shapeName() {
		System.out.println("Shape is Rectangular");
	}
}

public class Shappe {

	public static void main(String[] args) {
		Shape S = new Circle();
		Shape SS = new Rectangular();

		S.shapeName();
		S.Display();
		
		System.out.println();
		
		SS.shapeName();
		SS.Display();
	}
}
