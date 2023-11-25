package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class SquaringOfNumber {

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number = ");
int n = sc.nextInt();
squareOfNumber(n);
sc.close();
	}

	public static void squareOfNumber(int n) 
	{
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum += (i*i);
		}
		System.out.println(sum+" square of the given number");
	}

}
