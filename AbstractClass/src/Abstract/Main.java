package Abstract;

abstract class Shape3{
	public abstract void shapeName(); 
	//abstract method - no body, no implementation implement by all subclass
	
	public void shapeDisplay(){
		System.out.println("This is a Shape.");
	// Concrete method - provide implementation, common functionanility that can be shared by all subclasses
	}
	
}

class Circle extends Shape3{
	@Override
	public void shapeName() {
		System.out.println("This is Circle Shape");
	}
}

class Rectangle extends Shape3{
	@Override
	public void shapeName() {
		System.out.println("This is Rectangle");
	}
}

class Square extends Shape3{
	@Override
	public void shapeName() {
		System.out.println("This is Square");
	}
}

public class Main {

	public static void main(String[] args) {
		Shape3 s1 = new Circle();
		Shape3 s2 = new Rectangle();
		Shape3 s3 = new Square();
		
		s1.shapeName();
		s1.shapeDisplay();
		System.out.println();
		s2.shapeName();
		s2.shapeDisplay();
		System.out.println();
		s3.shapeName();
		s3.shapeDisplay();
		

	}

}
