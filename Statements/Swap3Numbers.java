package Statements;

import java.util.Scanner;

public class Swap3Numbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("********before swapping************* ");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("***********after swapping *********");
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		scan.close();
	}

}
