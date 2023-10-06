package com.in.forloop;

import java.util.Scanner;

public class SquaringNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number = ");
		int n = scan.nextInt();
		int square = sumOfSquares(n);
		System.out.println("square of the given number = "+square);
		scan.close();
	}

	private static int sumOfSquares(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum =sum+(i*i);
		}
		return sum;
	}

}
