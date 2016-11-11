package Circle;

public class Circle {
	private final double pi = 3.14;
	private double radius=4 ;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double perimeter() {
		double perimeter = 2 * pi * radius;
		return perimeter;
	}

	public double area() {
		double area = pi * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		System.out.println("find the perimeter of circle");
		Circle calculate = new Circle();
		System.out.println(calculate.perimeter());

		System.out.println("find the area of circle");
		System.out.println(calculate.area());
		
		
		
	}

}
