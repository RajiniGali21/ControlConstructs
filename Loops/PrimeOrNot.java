package Loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
		scan.close();
	}

}
