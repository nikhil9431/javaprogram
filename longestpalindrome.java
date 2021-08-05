package javaprogram;

import java.util.Scanner;

public class longestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String input=sc.nextLine();
		
		System.out.println("longest palindrome "+longestpalindrome.getlongestpalindrome(input));

	}
	public static String getlongestpalindrome(String input) {
		if(input.isEmpty())
			return "enter proper string";
		if(input.length() == 1)
			return input;
		String longest =input.substring(0,1);
		
		for(int i=0;i<input.length();i++) {
		
		String temp =CheckEquality(input,i,i);
		
			if(longest.length()<temp.length()) {
				longest =temp;
			}
			
			temp = CheckEquality(input, i,i+1);
			
			if(longest.length() < temp.length()) {
				longest = temp;
			}
		}
		return longest;
		
	}
	public static String CheckEquality(String input,int start,int end) {
		while(start>=0 && end <=input.length()-1 && input.charAt(start)== input.charAt(end)) {
			start--;
			end++;
		}
		return input.substring(start+1,end);
	}

}
