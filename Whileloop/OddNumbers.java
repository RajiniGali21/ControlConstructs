package com.in.Whileloop;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range from 1 to n = ");
		int num = scan.nextInt();

		System.out.println("sum of first" +num+" odd numbers = "+isSumOfOddNumbers(num));
		scan.close();
	}

	private static int isSumOfOddNumbers(int num)
	{
		int sum=0;
		for(int i =1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}
