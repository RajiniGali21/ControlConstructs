package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		countOdDigits(n);
		sc.close();
	}

	public static void countOdDigits(int n)
	{
		int r,count=0;
		while(n>0)
		{
		r=n%10;
//		System.out.println(r);
		count++;
		n=n/10;
		}
		System.out.println(count+" = count of given digit");
	}
	

}
