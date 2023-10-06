package com.in.forloop;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int TotalSum = sumOfGivenNumber(num);
		{
			System.out.println(TotalSum+" is the sum of the  given "+num+" number");
		}
		scan.close();
	}

	private static int sumOfGivenNumber(int num)
	{
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
		
	}

}
