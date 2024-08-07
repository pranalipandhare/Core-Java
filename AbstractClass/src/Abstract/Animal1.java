package Abstract;

abstract class animal {

	public abstract void makesound();
	// abstract method - no body, no implementation, inherit by all subclasses

	public void sleep() {
		System.out.println("This animal is sleeping");
	}

}

class Lion extends animal {
	@Override

	public void makesound() {
		System.out.println("Ghurrrrr");
	}
}

class Cat extends animal {
	@Override

	public void makesound() {
		System.out.println("Meow-Meow");
	}
}

class Dog extends animal{
	@Override
	
	public void makesound() {
		System.out.println("Bhohh-Bhohh");
	}
}

public class Animal1{
	
	public static void main(String[]args) {
		
		animal a1 = new Lion();
		animal a2 = new Cat();
		animal a3 = new Dog();
		
		a1.makesound();
		a1.sleep();
		System.out.println();
		
		a2.makesound();
		a2.sleep();
		System.out.println();
		
		a3.makesound();
		a3.sleep();
		System.out.println();
		
	}
}





