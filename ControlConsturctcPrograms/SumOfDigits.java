package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit = ");
		int n = sc.nextInt();
		sumOfDigits(n);
		sc.close();
	}

	public static void sumOfDigits(int n) 
	{
		int r=0;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum += r;
			n=n/10;
		}
		System.out.println(sum +" = sum of the given digits");
	}

}
