package final1;

public class FinalFieldMain {
	public static void main(String[] args) {
		//final field 생성자 초기화
		System.out.println("생성자 초기화");
		ConstructInit constructInit = new ConstructInit(10);
		System.out.println(constructInit.value);

		//final field 필드 초기화
		System.out.println("필드 초기화");
		FieldInit fieldInit = new FieldInit();
		System.out.println(fieldInit.value);

		// fieldInit.value = 10;
		//상수
		System.out.println("상수");
		System.out.println(FieldInit.CONST_VALUE);

	}
}
