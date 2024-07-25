package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();

		hashset.add("둘리");
		hashset.add("또치");
		hashset.add("도우너");
		hashset.add("도우너");

		System.out.println("set 목록 : " + hashset + " 크기 : " + hashset.size());

		hashset.remove("도우너"); // 순서가 없는 set은 인덱스가 사용 불가
		System.out.println("set 목록 : " + hashset + " 크기 : " + hashset.size());
	
		// Iterator 객체 생성
		Iterator<String> ir = hashset.iterator();
		
		while(ir.hasNext()) {	// 다음 요소가 있다면
			String member = ir.next();	// 다음 요소를 가져옴
			System.out.print(member + " ");
		}
		System.out.println();
		for (String member : hashset) {
			System.out.print(member + " ");			
		}		
		
	}

}
