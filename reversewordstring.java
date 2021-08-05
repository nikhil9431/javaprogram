package javaprogram;

import java.util.Scanner;

public class reversewordstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string: ");
		String str = sc.nextLine();
		
		
		String[] word=str.split(" ");
		String reverseword = " ";
		
		for(int i=0;i<word.length;i++) {
			String words = word[i];
			String revword=" ";
			
			for(int j=words.length()-1;j>=0;j--) {
				revword= revword+words.charAt(j);
				
			}
			reverseword=reverseword+revword;
		}
		System.out.println(reverseword);
		
		}

}
