package com.in.forloop;

import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String[]args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the range = ");
	int range = scan.nextInt();
	primeNumbers(range);
	scan.close();
	}

	private static void primeNumbers(int range) 
	{
		for(int j=2;j<=range;j++)
		{
			int count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0) {
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(j+" ");
			}
		}
	}
}



