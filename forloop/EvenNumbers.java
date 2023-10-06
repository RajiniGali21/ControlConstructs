package com.in.forloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("lisst of even numbers in a range from 1 to n = ");
		int num = scan.nextInt();
		printEvenNumbers(num);
		scan.close();
	}

	private static int printEvenNumbers(int num) 
	{
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		return num;
	}

}
