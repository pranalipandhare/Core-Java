package com.interfac;

//Each interface can 
//have abstract methods, default methods, and static methods

interface A {
	default void method() {
		System.out.println("Class A's");
	}
}

interface B {
	default void method() {
		System.out.println("class B's");
	}
}

//A class can implement multiple interfaces using the implements keyword. 
//This means the class must provide implementations for all the abstract methods in those interfaces.
class C implements A, B {
	
	@Override
	public void method() {
		// You must override the method to resolve ambiguity
        System.out.println("C's");
  
	}
}

public class MultipleInheritance_interface {

	public static void main(String[] args) {

		C obj = new C();
		obj.method();

	}

}
