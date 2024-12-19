package MethodsInJava;

public class frontBakc1 {

	public static void main(String[] args) {
		String str = "ab123";
		System.out.println();
		
		
	}
	
	public static String frontBack(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length()<2) {
			System.out.println(str);
			
		}else {
			sb.append(str.charAt(str.length()-1));
			sb.append(str.substring(1,str.length()-1));
			sb.append(str.charAt(0));
			
		}
		System.out.println(str.substring(1, 4));
		return str;
		
	}
}
