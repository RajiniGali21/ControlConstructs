package Loops;

import java.util.Scanner;

public class CountOfNumbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int r,count=0;
		while(num>0)
		{
			r=num%10;
			System.out.println(r);
			count++;
			num=num/10;
			scan.close();
		}
		System.out.println("count of given number is ="+(count));

		
	}

}
