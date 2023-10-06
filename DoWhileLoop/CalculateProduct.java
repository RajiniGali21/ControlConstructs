package com.in.DoWhileLoop;

import java.util.Scanner;

public class CalculateProduct {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		long product = calculateProduct(n);
		System.out.println(product+" = product of the given number");
		scan.close();
	}

	private static long calculateProduct(int n) 
	{
		int pro = 1,r=1;
		do
		{
			r=n%10;
			pro = pro*r;
			n=n/10;
		}
		while(n!=0);
		{
			return pro;
		}
	}

}
