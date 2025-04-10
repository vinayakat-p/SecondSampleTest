package day1;

public class Main {
	public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of Circle: " + calculator.calculateArea(5));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(4, 6));
        System.out.println("Area of Triangle: " + calculator.calculateArea(3, 4));

	System.out.println("Area of Circle: " + calculator.calculateArea(8));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(10, 60));
        System.out.println("Area of Triangle: " + calculator.calculateArea(3, 594));
    }
}
