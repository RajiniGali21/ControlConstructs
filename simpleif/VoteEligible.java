package com.in.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age = ");
		int age = scan.nextInt();
		isVotingEligible(age);
		scan.close();
	}

	private static void isVotingEligible(int age) 
	{
		if(age>18)
		{
			System.out.println(age+"is voting eligible");
		}
		else
		{
			System.out.println(age+"is not eligible");
		}
	}
	

}
