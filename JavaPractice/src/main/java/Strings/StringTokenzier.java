package Strings;

import java.util.StringTokenizer;

public class StringTokenzier {

	public static void main(String[] args) {
		// breakdown the string then we can use the stingtokenizer
		
		StringTokenizer st = new StringTokenizer("My|Name|Is|Jatin|Patel", "|");
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
			
		}

	}

}
