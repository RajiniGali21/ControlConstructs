package com.in.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter the number = ");
		 int num = scan.nextInt();
		 int digit = sumOfDigits(num);
		 System.out.print(digit+" =  sum of the given digit");
		 scan.close();
	}

	private static int sumOfDigits(int num) 
	{
		int r=0,sum=0;
//		for(int i=0;num!=0;i++)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		return sum;
	}

}
