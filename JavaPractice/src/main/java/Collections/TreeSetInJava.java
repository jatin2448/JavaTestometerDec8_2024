package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Null value is not allowed
		 * Sorting is allowed on natural order
		 */
		Set<Integer> tset = new TreeSet<Integer>();
		
		//tset.add(null);
		tset.add(12);
		tset.add(13);
		tset.add(12);
		tset.add(14);
		tset.add(1);
		
		System.out.println(tset);
		
	}

}
