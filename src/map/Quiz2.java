package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz2 {

	public static void main(String[] args) {

		// String 형 key, int형 value 를 가지는 Hashmap 객체를 생성하세요
		HashMap<String, Integer> map  = new HashMap<>();
		
		// map 내 데이터 추가
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		// map 내 데이터 수정
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		// 영어라는 키 값을 갖고 있는 데이터 삭제
		map.remove("영어");
		
		// 키값 순회하기
		Set<String> keyset = map.keySet(); 
		
		// 하나씩 출력
		for (String st : keyset) {
			System.out.println("map의 요소 하나씩 출력 "+"[Key] : " + st + " [Value] : " + map.get(st));
		}
		
		// 한번에 출력
		System.out.println("map에 저장된 모든 요소 출력 : "+ map);
		
		// map 사이즈 출력
		System.out.println("map의 크기 : " + map.size());
		
	}

}
