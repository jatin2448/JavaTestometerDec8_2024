package Strings;

public class StrigInJava {

	public static void main(String[] args) {

		String str ="December";

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.toCharArray());
		System.out.println(str.compareToIgnoreCase("December1"));
		System.out.println(str.charAt(7));
		System.out.println(str.concat(" Jan "));
		System.out.println(str.indexOf("be"));
		System.out.println(str.endsWith("er"));



		/* Strings are imutable in JAVA
		 * imutalbe means - string cannot be changed 
		 * */

		int i = 10;

		i = 8;
	}
}
