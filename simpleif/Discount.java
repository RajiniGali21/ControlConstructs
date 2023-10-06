package com.in.simpleif;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the price = ");
		int price = scan.nextInt();
		boolean flag = isDiscountApplicable(price);
		if(flag)
		{
			System.out.println(price+ " = Discount is Applicable");
		}
		else
		{
			System.out.println(price+" = No Discount Applicable");
		}
		scan.close();
	}

	private static boolean isDiscountApplicable(int price)
	{
		if(price>100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
