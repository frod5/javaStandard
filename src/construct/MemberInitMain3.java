package construct;

public class MemberInitMain3 {
	public static void main(String[] args) {
		MemberInit memberInit1 = new MemberInit();
		memberInit1.initMember("user1", 15, 90);

		MemberInit memberInit2= new MemberInit();
		memberInit2.initMember("user2", 16, 80);

		MemberInit[] memberInits = {memberInit1 ,memberInit2};
		for (MemberInit s : memberInits) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
}
