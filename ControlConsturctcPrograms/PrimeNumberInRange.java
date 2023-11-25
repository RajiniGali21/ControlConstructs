package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number = ");
		int a = sc.nextInt();
		System.out.println("enter the end number = ");
		int b = sc.nextInt();
		primeNumberInRange(a,b);
		sc.close();
	}

	public static void primeNumberInRange(int a, int b) 
	{
		System.out.println("prime number in a given range");
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<=2)
			{
			System.out.println(i+" ");
			}
		}
	}

}
