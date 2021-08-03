package javaprogram;

import java.util.Scanner;

public class palindromeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:- ");
		int number= sc.nextInt();
		  int r,sum=0,temp;    
		  int n=number;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

	
