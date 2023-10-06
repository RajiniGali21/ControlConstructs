package com.in.forloop;

import java.util.Scanner;

public class GcdNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the values = ");
		int a = scan.nextInt();
		int b= scan.nextInt();
		int num = calculateGcdNumber(a,b);
		System.out.println(num+ "  = is gcd of given values");
		scan.close();
	}

	private static int calculateGcdNumber(int a, int b) 
	{
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}

}
