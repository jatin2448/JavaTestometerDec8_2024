package Collections;
import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>(); 
		//This is the LIFO structure (Last In first Out)
		stack.push(1);
		stack.push(2);
		stack.push(null);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);


		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		int num = stack.pop();
		System.out.println(num);
		System.out.println(stack);
		
		// Interview Question
		// Check bracket balanced parenthesss in an expression
	}

}
