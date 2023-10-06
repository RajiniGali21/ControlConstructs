package Loops;

import java.util.Scanner;

public class Naricssistic1Number 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int digit = countDigits(num);
		boolean isNarcissistic = isNarcissisticNumber(num,digit);
		if(isNarcissistic)
		{
			System.out.println(num+  " = is a narcissistic number ");
		}
		else
		{
			System.out.println(num+ " = is not a narcissistic number ");
		}
		scan.close();
		
	}

	private static boolean isNarcissisticNumber(int num, int digit) 
	{
		int sum=0;
		int temp=num;
		while(temp!=0) 
		{
			int no = temp%10;
			sum += power(no,digit);
			temp=temp/10;
	    }
	return num==sum;
	}

	private static int power(int no, int digit) 
	{
		int result = 1;
		for(int i=0;i<digit;i++)
		{
			result= result*no;
		}
		return result;
	}

	private static int countDigits(int num) 
	{
		int count=0;
			while(num!=0)
			{
				num=num/10;
				count++;
				
			}
			return count;
	}

}
