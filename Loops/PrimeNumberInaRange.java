package Loops;

import java.util.Scanner;

public class PrimeNumberInaRange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the min value = ");
		int start = scan.nextInt();
		System.out.println("enter the max value = ");
		int end = scan.nextInt();
		printPrimeNumberInaGivenRange(start,end);
		scan.close();
	}

	public static void printPrimeNumberInaGivenRange(int start, int end) 
	{
	System.out.println("prime numbers in between range "+start+" and "+end+ " is = ");

		for(int i=start;i<=end;i++)
		{
			int count =0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<=2)
			{
			System.out.println(i+" ");
			}
		}
	}
}
