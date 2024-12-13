package Strings;

public class StringbuinkderInJava {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		System.out.println(str);
		
		str.append("My ");
		str.append("Name ");
		str.append("is ");
		str.append("Jatin ");
		
		System.out.println(str);
		System.out.println(str.reverse());
	}
}
