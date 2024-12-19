package MethodsInJava;

public class WithoutReturnType {
	
	public static void main(String[] args) {
	
		sumOfNum(3,6); //Call a method
		sumOfNum(5,8);
		sumOfNum(1,9);
		sumOfThreeNumber(1, 2, 3);
	}
	

	//Create a method
	public static void sumOfNum(int a, int b) {
		/*
		 * int num1 = 45; int num2 = 55;
		 */
		
		System.out.println("Sum is " + (a+ b));
	}
	
	public static void sumOfThreeNumber(int a, int b, int c) {
	
	
		System.out.println("Sum is "+(a + b + c));
	}
}
