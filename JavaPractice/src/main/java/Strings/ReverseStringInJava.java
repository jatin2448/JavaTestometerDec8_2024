package Strings;

import java.util.Iterator;

import loop.ForLoop1;

public class ReverseStringInJava {

	public static void main(String[] args) {

		String str ="Abcdef";
		char [] ch = str.toCharArray();

		for (char c : ch) {
			System.out.print(c);
			//System.out.println();

		}
		System.out.println();
		for (int i = ch.length-1; i >= 0; i--) {

			System.out.print(ch[i]);

		}
		
		System.out.println();
		for (int k=str.length()-1; k>=0; k--) {
			
			System.out.print(str.charAt(k));
		}
	}






}
