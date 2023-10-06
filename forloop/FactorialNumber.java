package com.in.forloop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number = ");
		int num = scan.nextInt();
		int factorial = calculateFactorial(num);
		{
			System.out.println(factorial+" = factorial of given "+num+ " number ");
		}
		scan.close();
	}
	


	private static int calculateFactorial(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
