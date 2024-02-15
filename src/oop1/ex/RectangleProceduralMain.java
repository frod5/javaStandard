package oop1.ex;

public class RectangleProceduralMain {
	public static void main(String[] args) {
		int width = 5;
		int height = 8;
		int area = calculateArea(width, height);
		System.out.println("area = " + area);

		int perimeter = calculatePerimeter(width, height);
		System.out.println("perimeter = " + perimeter);

		boolean isSquare = isSquare(width, height);
		System.out.println("isSquare = " + isSquare);
	}

	static boolean isSquare(int width, int height) {
		return width == height;
	}

	static int calculatePerimeter(int width, int height) {
		return (width + height) * 2;
	}

	static int calculateArea(int width, int height) {
		return width * height;
	}

}
