package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Float> alist = new ArrayList<>();

		List<Float> llist = new LinkedList<>();

		long starttime = System.currentTimeMillis();


		for (int i=0; i<=100000; i++) {


			alist.add(12.59f);
			alist.add(22.59f);
			alist.add(32.59f);
			alist.add(42.59f);
			alist.add(52.59f);
			alist.add(62.59f);


			alist.remove(2);
			alist.remove(2);

		}
		long endTime = System.currentTimeMillis();

		System.out.println(alist.size());
		System.out.println("Total Time :" + (endTime-starttime));


		//Link list is faster that arraylist (so check the the output and compare with both the result
		long starttime1 = System.currentTimeMillis();


		for (int i=0; i<=100000; i++) {


			llist.add(12.59f);
			llist.add(22.59f);
			llist.add(32.59f);
			llist.add(42.59f);
			llist.add(52.59f);
			llist.add(62.59f);


			llist.remove(2);
			llist.remove(2);

		}
		long endTime1 = System.currentTimeMillis();

		System.out.println(llist.size());
		System.out.println("Total Time :" + (endTime1-starttime1));
	}

}
