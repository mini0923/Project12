package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
		
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");

		MemberHashMap memberHashMap = new MemberHashMap();

		Member2 member1 = new Member2(1001, "둘리");
		Member2 member2 = new Member2(1002, "또치");
		Member2 member3 = new Member2(1003, "도우너");
		Member2 member4 = new Member2(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showAllMember();

		memberHashMap.removeMember(1005);			
		memberHashMap.showAllMember();
	
	}

}

//쇼핑몰 회원
class Member2 {
	int memberId;	// 회원아이디
	String memberName; // 회원이름
	
	public Member2(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}

//회원 관리 클래스
class MemberHashMap {
	
	// 회원 목록
	HashMap<Integer, Member2> map;	// 리스트 선언
	
	// 인스턴스 생성 + 초기화
	public MemberHashMap () {
		map = new HashMap<Integer, Member2>();	// map 생성
	}
	
	// 리스트에 회원을 추가하는 메소드
	public void addMember (Member2 member) {
		map.put(member.memberId, member);
	}
	
	// 아이디로 회원을 삭제하는 메소드
	public void removeMember(int memberId) {
		
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId + " 번 회원을 삭제하였습니다.");			
			return;
		}
		System.out.println(memberId + " 번 회원이 존재하지 않습니다.");
	}
	
	public void showAllMember() {
		
		// 회원 목록 순회하기
		Collection<Member2> values = map.values();
		
		// 각각 하나씩 출력
		for (Member2 member : values) {
			System.out.println(member);
		
		}
	}
	

}



