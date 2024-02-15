package oop1.ex;

public class Rectangle {
	int width;
	int height;
	int area() {
		return width * height;
	}

	int perimeter() {
		return (width + height) * 2;
	}

	boolean isSquare() {
		return width == height;
	}
}
