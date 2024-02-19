package poly.ex4;

public class Dog extends AbstractAnimal {
	/**
	 * 추상메소드는 반드시 구현해야한다.
	 */
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("개 이동");
	}
}
