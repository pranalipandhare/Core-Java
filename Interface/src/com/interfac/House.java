package com.interfac;


interface Door{
	void close();
	// Abstract method - no body, no implementation, inherit by all subclasses
	
	default void open() {
		System.out.println("Open The Door");
	}
	
}

class Door1 implements Door{
	@Override
	public void close() {
		System.out.println("Close the Door");
	}
}

class Door2 implements Door{
	@Override
	public void close() {
		System.out.println("Close the Door while class is on going");
	}
	
	
}
public class House {

	public static void main(String[] args) {
		
		Door D = new Door1();
		Door DD = new Door2();
		
		D.close();
		D.open();
		
		System.out.println();
		
		DD.close();
		DD.open();

	}

}
