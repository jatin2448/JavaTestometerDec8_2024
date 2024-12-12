package loop;

import java.util.Iterator;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println("===========For Loop===========");
		for (int j = 0; j<=10; j++) {
			System.out.println(i-j);
			
		}
		
		System.out.println("===========While Loop===========");
		
		while (i>=0) {
			System.out.println(i);
			i--;
			
		}
	}

}
