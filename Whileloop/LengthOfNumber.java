package com.in.Whileloop;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		int len = lengthOfNumber(n);
		System.out.println(len+" = length ");
		scan.close();
	}

	private static int lengthOfNumber(int n) 
	{
//		if(n==0) {
//			return 1;
//		}
		int length =0;
		while(n!=0) {
			n=n/10;
			length++;
		}
		return length;
	}

}
