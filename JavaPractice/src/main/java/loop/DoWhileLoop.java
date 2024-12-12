package loop;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 10;

		System.out.println("While Loop");

		while (i > 0) {
			System.out.println(i);
			i--;

		}

		i = 10;
		System.out.println("Do While Loop");

		do {
			System.out.println(i);
			i--;
		} while (i > 0);
	}
}
