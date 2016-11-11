package Circle;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		do {

			System.out.println("which shape you like to print?");
			Scanner input = new Scanner(System.in);
			int shapeNumber = input.nextInt();
			System.out.println("which attribute you want to calculate? 1. area, 2.perimeter");
			int functionNumber = input.nextInt();

			switch (shapeNumber) {
			case 1:
				System.out.println("the no. 1 shape name is rectangle");
				Rectangle rectangle = new Rectangle();
				System.out.println("enter the heigth of rectangle");
				double heigth = input.nextDouble();
				rectangle.setHeigth(heigth);

				System.out.println("enter the width of rectangle");
				double width = input.nextDouble();
				rectangle.setWidth(width);

				rectangle.area();

				if (shapeNumber == 1 && functionNumber == 1) {

					System.out.println("the area of rectangle is" + rectangle.area());
				} else {

					rectangle.perimeter();
					System.out.println("the perimeter of rectangle is" + rectangle.perimeter());
				}

				break;

			case 2:
				System.out.println("the no. 2 shape name is triangle");
				Triangle triangle = new Triangle();
				System.out.println("enter the heigth1 of triangle");
				double side1 = input.nextDouble();
				triangle.setheigth1(side1);

				System.out.println("enter the height2 of triangle");
				double side2 = input.nextDouble();
				triangle.setheigth2(side2);

				System.out.println("enter the base of triangle");
				double base = input.nextDouble();
				triangle.setbase(base);

				if (shapeNumber == 2 && functionNumber == 1) {

					triangle.area();
					System.out.println("the area of traiangle is" + triangle.area());
				} else {
					triangle.perimeter();
									System.out.println(triangle.perimeter());
				}
				break;

			case 3:
				System.out.println("the no. 3 shape is circle");
				Circle circle = new Circle();
				System.out.println("enter the value of radius");
				double radius = input.nextDouble();
				circle.setRadius(radius);
				if (shapeNumber == 3 && functionNumber == 1) {
					circle.area();
					System.out.println("the area of circle is" + circle.area());
				} else {
					circle.perimeter();
					System.out.println("the circumference of circle is" + circle.perimeter());
				}

			}

		} while (true);

	}
}
