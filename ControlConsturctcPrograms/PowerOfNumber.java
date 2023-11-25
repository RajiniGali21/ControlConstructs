package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the base = ");
int base = sc.nextInt();
System.out.println("enter the exponent = ");
int exponent = sc.nextInt();
powerOfNumber(base,exponent);
sc.close();
	}

	public static void powerOfNumber(int base, int exponent) 
	{
		int power=1;
		for(int i=1;i<=exponent;i++)
		{
			power = power*base;
		}
		System.out.println("power of given number = "+power);
	}
	

}
