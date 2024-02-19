package poly.basic;

//자바가 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
	public static void main(String[] args) {
		Parent parent1 = new Child(); // Child 생성 -> Parent도 생성된다. (상속하고 있기 때문에) 메모리상에 Parent, Child 둘다 존재.
		Child child1 = (Child) parent1;
		child1.childMethod(); // 문제없음.

		Parent parent2 = new Parent(); // Parent 생성 -> Child는 생성되지 않는다. (메모리상에 Child가 없음)
		Child child2 = (Child) parent2; // 그런데 다운캐스팅을 진행하면 exception 발생. compile 오류가 아닌 runtime 오류 발생
		child2.childMethod();

		//업캐스팅은 위험하지 않은 이유 -> 하위타입 생성 시 상속한 상위 부모타입들이 모두 생성되기 때문.
	}
}
