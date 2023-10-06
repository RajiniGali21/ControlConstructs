package com.in.DoWhileLoop;

import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values from start and ending numbers = ");
		int start= scan.nextInt();
		int end =scan.nextInt();
		int divisor= scan.nextInt();
		calculateDivisibleSum(start,end,divisor);
		scan.close();
	}

	private static void calculateDivisibleSum(int start, int end, int divisor)
	{
		
	}

}
