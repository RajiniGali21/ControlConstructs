package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		palindromeOrNot(n);
		sc.close();
		
	
	}

	public static void palindromeOrNot(int n) 
	{
		int r=0,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}

}
