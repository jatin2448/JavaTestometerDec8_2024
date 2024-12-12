package loop;

import java.util.Iterator;

public class ForLoops2 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * i;

		}
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
