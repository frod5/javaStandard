package final1;

public class FinalLocalMain1 {
	public static void main(String[] args) {
		//final 지역변수1
		final int data1;
		data1 = 10; //최초 값 할당. 한번만 가능
		// data1 = 20; // compile error

		//final 지역변수1
		final int data2 = 20;
		// data2 = 30; // compile error
	}

	static void method(final int parameter) {
		// parameter = 200; //compile error
	}
}
