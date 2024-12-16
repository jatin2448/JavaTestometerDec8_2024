package UserInput;

import java.util.Scanner;

public class ScannerInJava {
	
	public static void main(String[] args) {
		//Addition of 2 Integers
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		int i = sc.nextInt();
		System.out.println("Enter Second Number");
		
		int j = sc.nextInt();
		
		System.out.println("result : "+ (i+j));
	}

}
