package com.in.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age = ");
		int age = scan.nextInt();
		discountBasedOnAge(age);
		scan.close();
	}

	private static void discountBasedOnAge(int age)
	{
		if(age>16 && age<25)
			System.out.println(age+" is eligible for senior citizen");
		else if(age<16)
			System.out.println(age+" is not eligible for senior citizen");
	}

}
