package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list);
		
		if (list.contains('A')) {
			list.remove(0);
			System.out.println(list);
		}
		

	}

}
