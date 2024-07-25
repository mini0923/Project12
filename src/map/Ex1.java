package map;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		
		// int형 키, String형 value를 저장하는 맵 생성
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "사과");	// key, value 쌍으로 값 추가
		map.put(2, "바나나");
		map.put(3, "코코넛");
		
		System.out.println("hashmap : " + map);
		
		// 키로 데이터 찾기
		System.out.println("key : 1 , value : " + map.get(1));
		System.out.println("key : 2 , value : " + map.get(2));
		System.out.println("key : 3 , value : " + map.get(3));
		
		// 데이터 수정하기
		map.replace(2, "블루베리");
		System.out.println("hashmap : " + map);
		
		// 데이터 삭제하기
		map.remove(1); // 키값이 1인 데이터 삭제
		System.out.println("hashmap : " + map);
		
		// map 크기 구하기
		int size  = map.size();
		System.out.println("map의 크기 : " + size);
		
		// 특정 키 값이 존재하는지 확인하기
		if (map.containsKey(1)) {
			System.out.println("map에 1이라는 키가 있습니다.");
		} else {
			System.out.println("map에 1이라는 키가 없습니다.");			
		}
			
		
		
	}
	
}
