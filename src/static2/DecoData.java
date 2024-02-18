package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
		// instantValue++; 인스턴스 변수 접근 불가
		// instantMethod(); 인스턴스 메소드 접근 불가

		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메소드 접근
	}

	public void instanceCall() {
		instanceValue++;
		instanceMethod();

		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메소드 접근
	}

	private void instanceMethod() {
		System.out.println("instanceValue = " + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue = " + staticValue);
	}
}