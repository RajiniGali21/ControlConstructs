package com.in.ifelse;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the marks = ");
		int marks = scan.nextInt();
		isPassOrFail(marks);
		scan.close();
	}

	private static void isPassOrFail(int marks) 
	{
		if(marks>50)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
