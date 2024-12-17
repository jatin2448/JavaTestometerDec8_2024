package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInJava {
	public static void main(String[] args) {
		
		//Priority Queue
		//Should not allow null
		// Should allow the duplicate value
		
		Queue<Integer> queue = new PriorityQueue<>();
		// queue.add(null); //It should not alow the null value
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(2);
		
		System.out.println(queue);
		
		//first point (peek se) data access karvata he but remove nai hota he
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
