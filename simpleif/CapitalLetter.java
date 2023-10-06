package com.in.simpleif;

import java.util.Scanner;

public class CapitalLetter 
{
 public static void main(String[]args)
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the character = ");
	 char c = scan.next().charAt(0);
	 isCaptialLetter(c);
	 scan.close();
	}

private static void isCaptialLetter(char c) 
{
if(Character.isUpperCase(c))
System.out.println(c+" is a Uppercase");
else if(Character.isLowerCase(c))
System.out.println(c+" is a Lowercase");
else
	System.out.println(c+" is not a charcter");
}

}
