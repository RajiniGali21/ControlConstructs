package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		fibanociiSeries(n);
		sc.close();
	}

	public static void fibanociiSeries(int n) 
	{
		int firstNumber = 0,secondNumber=1;
		int nextNumber =0;
		System.out.print(firstNumber+" "+secondNumber+" ");
		for(int i=1;i<=n;i++) 
		{
		nextNumber = firstNumber+secondNumber;
		System.out.print(" "+nextNumber+" ");
		firstNumber=secondNumber;
		secondNumber=nextNumber;
		}
		System.out.println();
	}

}
