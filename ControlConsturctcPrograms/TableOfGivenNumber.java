package com.kn.ControlConsturctcPrograms;

import java.util.Scanner;

public class TableOfGivenNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		 int n = sc.nextInt();
		 tableOfGivenNumber(n);
		 sc.close();
	}

	public static void tableOfGivenNumber(int n) {
		System.out.println("******Table******");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}

}
