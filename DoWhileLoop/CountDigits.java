package com.in.DoWhileLoop;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		int digits = countDigits(n);
		System.out.println(digits+" = no of digits in a given number ");
		scan.close();
	}

	private static int countDigits(int n)
	{
		int count=0;
		int rem = 0;
		do
		{
			rem=n%10;
			n=n/10;
			count++;
			
		}
		while(n!=0);
		{
			return count;
		}
	}

}
