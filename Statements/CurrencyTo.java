package Statements;

import java.util.Scanner;

public class CurrencyTo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the currency in INR = ");
		int a = scan.nextInt();
		{
		System.out.println("currency to dollar="+currencyToDollar(a));
		System.out.println("currency to pounds="+currencyToPounds(a));
		}
		scan.close();
	}

	private static double currencyToPounds(int a) 
	{
		return a*1.27;
	}

	private static double currencyToDollar(int a) 
	{
		return a*82.73;
	}

}
