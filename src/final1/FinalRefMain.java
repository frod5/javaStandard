package final1;

public class FinalRefMain {
	public static void main(String[] args) {
		final Data data = new Data();
		// data = new Data(); // final이라 불가

		data.value = 10;
		System.out.println("Data.value = " + data.value);
	}
}
