package Loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" enter a number = ");
		int num = scan.nextInt();
		int r=0;
		System.out.print("reversed number = ");
		while(num>0)
		{

			r = num%10;
			System.out.print(r);
			num = num/10;
			
		}


		scan.close();
	}


	}

	
