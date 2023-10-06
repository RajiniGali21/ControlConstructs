package com.in.switchcase;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the month = ");
		int month = scan.nextInt();
		String flag = daysInAMonth(month);
		System.out.println(flag);
		scan.close();
	}
	

	private static String daysInAMonth(int month)
	{
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		
			return "number of days 31...";
		
		case 4:
		case 6:
		case 9:
		case 11:
			
			return "number of days 30...";
			
		case 2:
			
			return "number of days 28...";

		default:
			
			return "invalid month...please enter 1 to 12";
		}
	}

}
