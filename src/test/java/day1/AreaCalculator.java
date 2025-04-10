package day1;

public class AreaCalculator {

	// Method to calculate the area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    double calculateArea(double base, float height) {
        return 0.5 * base * height;

	    //Dummy comment
    }
}
