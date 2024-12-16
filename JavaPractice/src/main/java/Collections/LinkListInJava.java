package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Linked list is faster than the arraylist
		List<Float> list = new LinkedList<Float>();
		
		list.add(12.76f);
		list.add(22.76f);
		list.add(25.08f);
		list.add(30.32f);
		list.add(32.23f);
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.remove(2);
		System.out.println(list.get(2));

	}

}
