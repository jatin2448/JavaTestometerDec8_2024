package MethodsInJava;

public class WithReturnType {

	public static void main(String[] args) {
		
		int result = sumOfNumbers(10,20);
		System.out.println(result);
		
		int [] resultArr = table1(result);
		
		for (int i : resultArr) {
			System.out.println("20X" + i);
		}
		
	}
	
	public static int sumOfNumbers(int a, int b) {
		
		return a+b;
	}
	
	public static void table(int result) {

		for (int i = 1; i < 10; i++) {
			System.out.println(result + " * " + i+ " = "+(result*i));
		}
	}
	public static int [] table1(int result1) {
		
		int [] arr = new int[10];

		for (int i = 1; i < 10; i++) {
			arr[i-1] = result1 *i;
		}
		return arr;
	}

}
