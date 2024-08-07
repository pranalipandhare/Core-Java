package Abstract;

abstract class Shape2 {
	public abstract void draw();

	public double area() {
		return 0;
		// default implementation
	}
}

class circle1 extends Shape2 {
	private double radius;

	public circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangular extends Shape2 {
	private double width;
	private double height;

	public Rectangular(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangular");
	}

	@Override
	public double area() {
		return width * height;
	}
}

public class Shape1 {
	public static void main(String[] args) {
		Shape2 h1 = new circle1(3);
		Shape2 h2 = new Rectangular(2, 2);

		h1.draw();
		System.out.println("Area of circle: " + h1.area());

		System.out.println();

		h2.draw();
		System.out.println("Area of Rectangular " + h2.area());

	}
}
