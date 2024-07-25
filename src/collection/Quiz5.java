package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz5 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		System.out.println("set의 크기 : " + hashSet.size());
		
		Iterator<Integer> ir = hashSet.iterator();
		
		while (ir.hasNext()) {
			Integer num = ir.next(); 
			System.out.print(num + " ");
		}
		System.out.println();
		
		for (Integer num : hashSet) {
			System.out.print(num + " ");
		} 
		
		
	}

}

