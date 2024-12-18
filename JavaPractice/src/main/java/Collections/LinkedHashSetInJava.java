package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Linked Set
		 */

		Set<Float> lset = new LinkedHashSet<>();
		
		lset.add(null);
		//lset.add(null);
		lset.add(12.4f);
		lset.add(12.5f);
		lset.add(12.f);
		lset.add(12.6f);
		
		System.out.println(lset);
	}

}
