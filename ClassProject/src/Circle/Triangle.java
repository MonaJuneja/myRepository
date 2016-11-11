package Circle;

public class Triangle {
	private double base;
	private double side1;
	private double side2;

	public Triangle() {
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getbase() {
		return base;
	}

	public void setbase(double base) {
		this.base = base;
	}

	public double getside1() {
		return side1;
	}

	public void setheigth1(double side1) {
		this.side1 = side1;
	}

	public double getside2() {
		return side2;
	}

	public void setheigth2(double side2) {
		this.side2 = side2;
	}

	public double area() {
	double s = 0.5*(side1+side2+base);
	double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-base));
		return area;

	}

	public double perimeter() {
		double perimeter = base + side1 + side2;
		return perimeter;
	}

	public static void main(String[] args) {
		System.out.println("find the area of traingle");
		Triangle calculate = new Triangle();

		System.out.println(calculate.area());
		System.out.println("find the perimeter of traingle");
		System.out.println(calculate.perimeter());

	}

}
