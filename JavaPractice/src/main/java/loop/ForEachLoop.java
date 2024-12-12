package loop;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		String str = "My Name is Jatin";
		
		
		/*
		 * for (int i = 0; i < str.length; i++) {
		 * 
		 * System.out.println(str.charAt(i));
		 * 
		 * }
		 */
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
	}

}
