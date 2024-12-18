package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Insertion order is not allowing
		//remove the duplicate value
		//Allow the null value

		Set<String> hset = new HashSet<String>();
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add("Four");
		
		hset.add(null); 
		hset.add("Four"); //Duplicate value
		
		System.out.println(hset);
	}

}
