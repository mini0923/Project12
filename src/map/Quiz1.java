package map;

import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {

		// 문자타입 key, 문자열 타입 value 를 가지는 Hashmap 생성
		HashMap<Character, String> map = new HashMap<>();
		
		// map 내 데이터 추가
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		System.out.println(map);

		// 키값 중 b가 있다면 조회하는 조건문 생성
		if (map.containsKey('b')) {
			System.out.println("key : 'b' : " + map.get('b'));
		}
		
		map.replace('b', "블루베리");
		
		map.remove('a');
		
		System.out.println(map);
		
	}

}
