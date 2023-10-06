package com.in.forloop;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the base= ");
		int base = scan.nextInt();
		System.out.println("enter the exponent = ");
		int exponent = scan.nextInt();
		int flag = calculatePower(base,exponent);
		{
			System.out.println("power of a gievn number = "+flag);
		}
		scan.close();
		
		
	}

	private static int calculatePower(int base, int exponent) 
	{
		int power= 1;
		for(int i=1;i<=exponent;i++) 
		{
		power=power*base;	
		}
		return power;
	}

}
