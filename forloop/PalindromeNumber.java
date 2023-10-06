package com.in.forloop;

import java.util.Scanner;

//public class PalindromeNumber {
//
//	public static void main(String[] args)
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the number = ");
//		int num = scan.nextInt();
//		boolean palin = isPalindrome(num);
//		if(palin)
//		{
//			System.out.println(palin);
//		}
//		else
//		{
//			System.out.println(palin);
//		}
////		{
////			System.out.println(palin+" is a palindrome number");
////		}
////			else
////			{
////			System.out.println(palin+" is not palindrome number");
////		}
//		scan.close();
//	}
//
//	private static boolean isPalindrome(int num) 
//	{
//		int r=0,sum=0,temp=num;
//		{
//			for(int i=1;num!=0;i++)
//			{
//				r=num%10;
//				sum=sum*10+r;
//				num=num/10;
//			}
//			if(sum==temp)
//		return true;
//		else
//		{
//			return false;
//		}
//	}
//	}
//}

public class PalindromeNumber
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String a = scan.next();
		palindromeNumber(a);
		scan.close();
	}

	public static void palindromeNumber(String a)
	{
		int i=0;
		int j=a.length()-1;
		while(i<j)
		{
			if(a.charAt(i)!=a.charAt(j))
			{
				System.out.println("not palindrome");
//				break;
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("palindrome");
	}
}
