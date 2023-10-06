package com.in.simpleif;

import java.util.Scanner;

public class PositiveNumber {


	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		boolean flag = isPositiveNumber(num);
		if(flag)
		{
			System.out.println("the given number "+num+" is a positive number");
		}
		else
		{
			System.out.println("the gievn number "+num+" is a negative number");
		}
		scan.close();
	}

	private static boolean isPositiveNumber(int num) 
	{
		if(num>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
