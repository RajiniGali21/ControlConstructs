package com.in.Nestedif;

import java.util.Scanner;

public class LoanBasedOnAgeAndIncome {

	public static void main(String[] args)
	{
Scanner scan = new Scanner(System.in);
System.out.println("enter the age=");
int age = scan.nextInt();
System.out.println("enter the income = ");
int income = scan.nextInt();
boolean flag = loanBased(age,income);
if(flag)
{
	System.out.println("qualified for loan");
}
else
{
	System.out.println("not qaulified");
}
scan.close();
}

	private static boolean loanBased(int age, int income) 
	{

	if(age>=21)
	{
	
		if(income>20000)
		{
	
			return true;
		}
			else
			{
			return false;
			}
	}
	else
	{
		return false;
	}
	
}
}










