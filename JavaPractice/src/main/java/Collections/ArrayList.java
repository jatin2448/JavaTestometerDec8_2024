package Collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is the new commit

		List<String> fruites = new java.util.ArrayList<>();
		fruites.add("Apple");
		fruites.add("Orange");
		fruites.add("Strawberry");
		fruites.add("Orange");

		//Prnt above data one by one
		//Order of sequence is maintain

		System.out.println(fruites);

		System.out.println("==============================================");
		for (String s : fruites) {

			System.out.println(s); }

		System.out.println("==============================================");

		fruites.add("graps");
		fruites.add("Kiwi");
		Iterator<String> itr = fruites.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("==============================================");

		fruites.removeFirst();
		System.out.println(fruites);
		fruites.removeLast();
		System.out.println(fruites);
	}

}
