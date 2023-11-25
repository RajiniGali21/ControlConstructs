package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		factorsOfGivenNumber(n);
		sc.close();
	}

	public static void factorsOfGivenNumber(int n) {
		System.out.println("factors of given number is ==");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)

			{
				System.out.print(i+" "); 
			}
		}
		System.out.println();
	}

}
