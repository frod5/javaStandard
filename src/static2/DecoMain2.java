package static2;

public class DecoMain2 {
	public static void main(String[] args) {
		String s = "hello Java";
		String deco = DecoUtil2.deco(s); //static 메소드를 사용하면 객체 생성없이 메소드 사용.

		System.out.println("before: " + s);
		System.out.println("after: " + deco);
	}
}
