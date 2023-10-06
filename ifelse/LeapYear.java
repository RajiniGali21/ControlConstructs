package com.in.ifelse;

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
			System.out.println("give year "+year+ " is leap year");
		}
		else
		{
			System.out.println("gievn year "+year+"is not a leap year");
		}
		scan.close();
		
	}

	private static boolean isLeapYear(int year) 
	{
		if(year%4==0 || year%100==0 && year%400==0)
		
			{
			return true;
			}
		else
		{
			return false;
		}
		
			
			
			
		
	}
	
}


