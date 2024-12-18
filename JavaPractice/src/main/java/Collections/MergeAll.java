package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeAll {

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

		set1.addAll(set2);

		List<String> list =  new ArrayList<String>();
		list.addAll(set1);

		Collections.sort(list);
		
		Set<String> tset = new TreeSet<String>();
		tset.addAll(set1);
		System.out.println(list);
		System.out.println(tset);

		//System.out.println(set1);
	}

}