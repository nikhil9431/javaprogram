package javaprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
			 int num1=0,num2=1,num3,i,num;   
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter the number:- ");
			 num =sc.nextInt();
			 System.out.print(num1+" "+num2);//printing 0 and 1  
			 
			    
			 for(i=2;i<num;++i)   
			 {    
			  num3=num1+num2;    
			  System.out.print(" "+num3);    
			  num1=num2;    
			  num2=num3;    
			 }    
			  
		
		
	}
	}
}


