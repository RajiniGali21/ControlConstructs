package com.in.forloop;

import java.util.Scanner;

public class Fibanocii {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number = ");
		 int num = scan.nextInt();
		 calculateFibanocii(num);
//		 {
//			 System.out.println("fibanocii series of given number = "+fibanocii);
//		 }
		 scan.close();
	}

	private static int calculateFibanocii(int num) 
	{
		int firstNumber=0,secondNumber=1;
		int nextNumber=0;
		
		System.out.print("fibanocii series of given number is =");
		System.out.print(firstNumber+" "+secondNumber+" ");
		for(int i=2;i<=num;i++)
		{
		 nextNumber = firstNumber+secondNumber;
		 System.out.print(nextNumber+" ");
		 firstNumber=secondNumber;
		 secondNumber=nextNumber;
		}
		return nextNumber;
	}

}
