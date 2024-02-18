package static1;

public class Data3 {
	public String name; // 힙영역에서 관리. 인스턴스 변수
	public static int count; // static. 메모리의 메서드영역의 static 영역에서 관리된다. 힙영역에서 관리X. 클래스 변수(클래스 공용 변수)

	public Data3(String name) {
		this.name = name;
		count++;
	}
}
