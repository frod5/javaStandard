package static2.ex;

public class Car {
	private String name;
	private static int totalCarCount;

	public Car(String name) {
		System.out.println("차량 구입, 차량 이름: " + name);
		this.name = name;
		totalCarCount++;
	}

	public static void showTotalCars() {
		System.out.println("totalCarCount : " + totalCarCount);
	}
}
