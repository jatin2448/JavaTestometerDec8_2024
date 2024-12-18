package Collections;

import java.util.HashSet;
import java.util.Set;

public class RetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String > set1 = new HashSet<String>();
		set1.add(null);
		set1.add("One");
		set1.add("Three");
		set1.add("Five");
		System.out.println(set1);
		
		
		Set<String > set2 = new HashSet<String>();
		set2.add(null);
		set2.add("Two");
		set2.add("Four");
		set2.add("Five");
		
		System.out.println(set2);
		
		set1.retainAll(set2);
		
		System.out.println(set1);
	}

}
