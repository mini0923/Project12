package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		
		char c ;
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for (int i = 0; i < list.size(); i++) {
			c = list.get(i);
			System.out.println(c);
		}
		list.remove(1);
		
		int size = list.size();
		System.out.println("삭제 후 리스트 사이즈는 : " + size);
		
	}

}
