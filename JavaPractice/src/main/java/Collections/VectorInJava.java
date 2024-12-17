package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<String>();
		
		vector.add("ABC");
		vector.add("PQR");
		vector.add("EFG");
		vector.add("STR");
		
		Iterator<String> itr = vector.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		List<String> list = vector.reversed();
		System.out.println(list);
	}

}
