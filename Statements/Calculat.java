package Statements;
import java.util.Scanner;
public class Calculat {

	public static void main(String[] args) 
	{
		System.out.println("enter the opertors like :+,-,*,/");
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		System.out.println("enter a two numbers for :" +c);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(c=='+')
		{
			System.out.println("addition of two number "+a+ " and "+b+ ":"+(a+b));
		}
		else if(c=='-')
		{
			System.out.println("subtraction of two number "+a+ " and "+b+ ":"+(a-b));
		}
		else if(c=='*')
		{
			System.out.println("product of two number "+a+ " and "+b+ ":"+(a*b));
		}
		else if(c=='/')
		{
			System.out.println("division of two number "+a+ " and "+b+ ":"+(a/b));
		}
		scan.close();
		
	}

}
