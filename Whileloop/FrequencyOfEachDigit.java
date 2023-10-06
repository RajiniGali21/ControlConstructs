package com.in.Whileloop;

import java.util.Scanner;

public class FrequencyOfEachDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the digit = ");
		long num = scan.nextLong();
		int digit = scan.nextInt();
		System.out.println("count of digit is ="+digitFrequency(num,digit));
		scan.close();
	}

	private static int digitFrequency(long num, int digit) 
	{
		int count=0;
		while(num>0)
		{
			long r=num%10;
			if(digit==r)
			{
				count++;
			}
			num/=10;
		}
		return count;
	}

}
