package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		factorialOfGivenNumber(n);
		sc.close();
	}

	public static void factorialOfGivenNumber(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			
			fact=fact*i;
		}
		System.out.println(fact +" = factorial of given number");
		
	}

}
