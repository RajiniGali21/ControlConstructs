package com.in.simpleif;

import java.util.Scanner;

public class AdultProgram 
{

	public static void main(String[] args) 
	{
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the age = ");
    int age = scan.nextInt();
    boolean flag = isAge(age);
    if(flag)
    {
    	System.out.println("Adult");
    }
    else
    {
    	System.out.println("not Adult");
    }
    scan.close();
    
	}

	private static boolean isAge(int age)
	{
		if(age>18)
		{
			return true;
		}
	
		else
		{
			return false;
		}
	}
}


