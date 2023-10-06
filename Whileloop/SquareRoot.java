package com.in.Whileloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number =");
		int n = scan.nextInt();
		System.out.println("the square root of given number is ="+calculateSquareRoot(n));
		scan.close();
	}

	private static double calculateSquareRoot(int n) 
	{
		double t=0.0,sqrtroot = n/2;
		while((t-sqrtroot)!=0)
		{
			t = sqrtroot;
			sqrtroot=(t+(n/t))/2;
		}
		return sqrtroot;
	}

}
