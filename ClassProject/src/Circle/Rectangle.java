package Circle;

public class Rectangle {
	private double width;
	private double heigth;

	/*public Rectangle() {
		this.width = width;
		this.heigth = heigth;
	}*/

	public  double getwidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getheigth() {
		return heigth;
	}

	public double area() {
		 double area = width * heigth;
		return area;

	}

	public double perimeter() {
		double perimeter = (width + heigth) / 2;
		return perimeter;
	}

	/*public static void main(String[] args) {
		Rectangle calculate = new Rectangle(5, 6);
		System.out.println(calculate.area());
		System.out.println(calculate.perimeter());*/

	}

//}
