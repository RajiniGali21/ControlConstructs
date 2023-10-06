package com.in.forloop;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		 reverseNumber(num);
		System.out.print(" reverse of given number ");
		scan.close();
	}

	private static int reverseNumber(int num) 
	{
		int r=0;
//		for(int i=1;num!=0;i++)
		{
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
		return r;
	}

}
