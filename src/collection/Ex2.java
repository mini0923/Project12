package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new  Member(1001, "둘리");
		Member member2 = new  Member(1002, "또치");
		Member member3 = new  Member(1003, "도우너");
		
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3);		//리스트의 특징 : 순서 o , 중복 o
		
//		Member m1 = list.get(0);
//		System.out.println(m1);
//		
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		

		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		
	}

}

// 쇼핑몰 회원
class Member {
	int memberId;	// 회원아이디
	String memberName; // 회원이름
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
}
