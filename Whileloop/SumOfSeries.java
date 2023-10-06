package com.in.Whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
	int n = scan.nextInt();
	double sumofseries = calculateSumOfSeries(n);
	System.out.println(sumofseries+" = sum of the given series");
	scan.close();
		}

	private static double calculateSumOfSeries(int n) 
	{
		double sum=0.0;
//		for(double i=1.0;i<=n;i++)
//		{
//		sum=sum+1/i;	
//		}
//		return sum;

		double i=1.0;
		while(i<=n)
		{
			sum =sum+1/i;
		}
		return sum;
	}

}
