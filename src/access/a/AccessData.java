package access.a;

public class AccessData {
	public int publicField;
	int defaultField;
	private int privateField;

	public void publicMethod() {
		System.out.println("public method call " + publicField);
	}

	void defaultMethod() {
		System.out.println("default method call " + defaultField);
	}

	private void privateMethod() {
		System.out.println("private method call " + privateField);
	}

	public void innerAccess() {
		System.out.println("내부 호출");

		publicField = 100;
		defaultField = 200;
		privateField = 300;

		publicMethod();
		defaultMethod();
		privateMethod();
	}
}
