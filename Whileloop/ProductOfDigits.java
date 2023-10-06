package com.in.Whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		int pro = productOfDigits(n);
		System.out.println("product of given digits = "+pro);
		scan.close();
	}

	private static int productOfDigits(int n) 
	{
		int product=1,r=0;
		{
			while(n!=0)
			{
				r=n%10;
				product=product*r;
				n=n/10;
			}
			return product;
		}
	}

}
