package UserInput;

import java.util.Iterator;

public class Input1 {
	public static void main(String[] args) {
		
		//run time arguments
		
		//String[] str = {"Ahmedabad","Pune","Nagpur"};
		
		for (String s : args) {
			System.out.println(s);
		}
		
	}

}
