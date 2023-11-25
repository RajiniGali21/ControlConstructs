package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class ReverseOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		reverseOfDigits(n);
		sc.close();
	}

	public static void reverseOfDigits(int n) 
	{
		System.out.print("reverse of the digits = ");
		int r=0;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		System.out.println();
	}

}
