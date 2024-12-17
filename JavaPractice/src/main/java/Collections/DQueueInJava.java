package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class DQueueInJava {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();

		dq.add(2);
		dq.add(3);
		dq.add(4);
		
		System.out.println(dq);
		
		dq.addFirst(0);
		dq.addFirst(-2);
		dq.addFirst(13);

		System.out.println(dq);

		dq.addLast(24);
		//dq.addLast(-4);
		System.out.println(dq);
		dq.removeFirst();

		System.out.println(dq);
	}

}
