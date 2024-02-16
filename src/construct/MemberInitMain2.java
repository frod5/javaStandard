package construct;

public class MemberInitMain2 {
	public static void main(String[] args) {
		MemberInit memberInit1 = new MemberInit();
		initMember(memberInit1, "user1", 15, 90);

		MemberInit memberInit2= new MemberInit();
		initMember(memberInit2, "user2", 16, 80);

		MemberInit[] memberInits = {memberInit1 ,memberInit2};
		for (MemberInit s : memberInits) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
	static void initMember(MemberInit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
}
