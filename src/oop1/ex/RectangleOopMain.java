package oop1.ex;

public class RectangleOopMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = 5;
		rectangle.height =8;

		System.out.println("넓이: "+ rectangle.area());
		System.out.println("둘레: "+ rectangle.perimeter());
		System.out.println("정사각형 여부: "+ rectangle.isSquare());
	}
}
