package com.in.DoWhileLoop;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		isAutomorphic(n);
		scan.close();
	}

	private static void isAutomorphic(int n) {
		// TODO Auto-generated method stub
		
	}
}

//	private static int isAutomorphic(int n) 
//	{
//		int flag=0,q=n*n;
//		do
//		{
//		int d=n%10;
//		int d1=q%10;
//		if(d!=d1)
//		{
//			flag=1;
//		}
//			n=n/10;
//			q=q/10;
//		
//		
//		return n;
//		}
//	}
//}
		



