package javaprogram;

import java.util.Scanner;
import java.util.Stack;

public class validparentheses {
	public static boolean isValid(String s) {
		char arr[] = s.toCharArray();
		Stack<Character> set = new Stack();
		for (Character ch : arr) {
			if (ch == '{' || ch == '[' || ch == '(') {
				set.push(ch);
			} else if (ch == ']') {
				if (set.isEmpty() || set.peek() != '[') {
					return false;
				} 
				set.pop();
			} else if (ch == ')') {
				if (set.isEmpty() ||  set.peek() != '(') 
					return false;
				set.pop();	
			} else if (ch == '}') {
				if (set.isEmpty() ||  set.peek() != '{') 
					return false;
				set.pop();	
			}
		}
		return set.size() == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a string");
		String str =sc.nextLine();
		System.out.println(isValid("{}[]"));
		
		
		

	}

}
