package javaprogram;

import java.util.Scanner;

public class mathpow {
	private static int power(int x,int y) {
		int power1 = (int) Math.pow(x,y);
		return power1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number: ");
			int number=sc.nextInt();
			System.out.println("enter the power: ");
			int numpower=sc.nextInt();
	        int x = number;
	        int y = numpower;
	 
	        System.out.printf("value of %d the power %d is %d", x,y,power(x, y));
	    }

	}

}
