package final1;

public class FieldInit {
	static final int CONST_VALUE = 10;
	final int value = 10;

	// final로 이미 값이 할당된 경우 생성자로도 하지 못한다.
	// public FieldInit(int value) {
	// 	this.value = value;
	// }
}
