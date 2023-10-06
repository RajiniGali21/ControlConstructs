package com.in.Nestedif;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year = ");
		int year = scan.nextInt();
		boolean flag = isLeapYear(year);
		if(flag)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+"is not a leap year");
		}
		scan.close();
	}

	private static boolean isLeapYear(int year) 
	{
		if(year%4==0)
		{
			return true;
		}
			
			if(year%100==0)
		{
			if(year%400==0)
				return true;
			else
				return false;
		}
		
else
		return false;
	}

}




