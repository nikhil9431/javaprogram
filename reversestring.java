package javaprogram;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str =sc.nextLine();
		
		String string = str;
		String reversestring = " ";  
		
		for(int i = string.length()-1; i >= 0; i--){  
			reversestring = reversestring + string.charAt(i);  
        }  
		
		System.out.println("Reverse of given string: " + reversestring); 

	}

}
