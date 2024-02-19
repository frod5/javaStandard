package poly.ex3;

public class Dog extends AbstractAnimal {
	/**
	 * 추상메소드는 반드시 구현해야한다.
	 */
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
