package com.in.Whileloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the digits = ");
		int num = scan.nextInt();
		int large= largestDigit(num);
		System.out.println(large+" is the largest number in a given digit");
		scan.close();
	}

	private static int largestDigit(int num)
	{
//		if(num<=0)
//		{
//			System.out.println("number of digits should be greater than 0");
//		}
		int largest=0,r=0;
		while(num>0)
		{
			r=num%10;
			if(r>largest)
			{
				largest=r;
			}
			num=num/10;
				
			//largest = largest*10+9;
			//num--;
		}
		return largest;
	}

}
