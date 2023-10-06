package Statements;

import java.util.Scanner;

public class CubeOfNumber 
{

	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter a number:");
			int a = scan.nextInt();
			int Cube =cubeofNum(a);
			{
				System.out.println("cube of given number is :"+Cube);
			
			scan.close();
	}
}
		

		static int cubeofNum(int num) 
		{
			return num*num*num;
		}
		}
		
	
