package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is the new edit
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(423);
		list.add(23);
		
		System.out.println(list);
		
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(list.contains(423));
		
		System.out.println(list.size());
		
		Object [] arr = list.toArray();
		
		for (Object d : arr) {
			System.out.println(d);
			
		}
		
		
		List<Object> list2 = Arrays.asList(arr);
		
		System.out.println(list2);
	}

}
