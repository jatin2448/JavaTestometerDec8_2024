package UserInput;

import primitive.booleanInJava;

public class DataConversation {
	public static void main(String[] args) {
		String str = "1234";
		
		int i = Integer.parseInt(str);
		System.out.println(i + 5);
		
		String s1 = "12.5";
		
		float f = Float.parseFloat(s1);
		System.out.println(f + 2);
		
		String s2 = "true";
		
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);
		
		String s21 = String.valueOf(b);
	
		
		
	
	}

}
