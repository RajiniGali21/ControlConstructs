package com.in.elseifLadder;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) 
	{
Scanner scan = new Scanner(System.in);
System.out.println("enter the marks = ");
int marks = scan.nextInt();
isGrading(marks);
scan.close();
	}

	private static void isGrading(int marks) 
	{
if(marks>=90&&marks<=100)
{
	System.out.println("Grade A");
}
else if(marks>=80&&marks<=89)
{
	System.out.println("Grade  B");
}
else if(marks>=70&&marks<=79) {
	System.out.println("Grade C");
}
else if(marks>=60&&marks<=69)
{
	System.out.println("Grade D");
}
else
{
	System.out.println("Grade E");
}
	}

}
