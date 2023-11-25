package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number = ");
int n = sc.nextInt();
sumOfDigits(n);
sc.close();
	}

	public static void sumOfDigits(int n) 
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum +" sum of number");
	}

}
