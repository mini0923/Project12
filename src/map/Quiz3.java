package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		
		HashMap<String, Float> map = new HashMap<>();
		
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		// 과목명 출력
		System.out.println("과목명 출력");
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key);
		}
		
		//점수만 출력
		System.out.println("점수만 출력");
		Collection<Float> values = map.values();
		for (float value : values) {
			System.out.println(value);
		}
	
	}
	
}
