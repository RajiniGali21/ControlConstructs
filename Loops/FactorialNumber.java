package Loops;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
//		//for(int i=1;i<=num;i++)
//		for(int i=num;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("factorial of a given number ="+fact);
//		scan.close();
		int fact = factorialNumber(num);
		{
			System.out.println(" factorial of given number "+num+" is ="+fact);
		}
		scan.close();
	}

	private static int factorialNumber(int num) 
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact =  fact*i;
		}
		return fact;
	}

}
