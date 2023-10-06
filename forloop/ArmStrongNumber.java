package com.in.forloop;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range = ");
		int num = scan.nextInt();
		printArmStrongNumber(num);
		scan.close();
//		if(Armstrong==num)
//		{
//			System.out.println(num+"is a armstrong number");
//		}
//		else
//		{
//			System.out.println(num+"is not a armstrong");
//		}
//		scan.close();
//	}
//
//	private static boolean printArmStrongNumber(int range) 
//	{
//		int r=0,sum=0,temp=range;
//		for(int j=1;range!=0;j++)
//		{
//		for(int i=1;i<=j;i++)
//		{
//			r=range%10;
//			r=r*r*r;
//			sum=sum+r;
//			range=range/10;
//		}
//		if(temp==sum)
//		{
//			return true;
//		}
//		return sum;
//		}
		
		
	}

	private static void printArmStrongNumber(int num) 
	{
		System.out.println("Armstrong numbers are = ");
		for(int i=1;i<=num;i++)
		{
			if(armstrong(i))
			{
				System.out.println(i+" ");
			}
		}
	}

	private static boolean armstrong(int num) 
	{
		int r,sum=0,temp=num;
		for(;num>0;)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num/=10;
		}
		if(temp==sum)
		{
			return true;
		}
		return false;
	}

}
