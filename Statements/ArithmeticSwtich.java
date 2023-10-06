package Statements;
import java.util.Scanner;
public class ArithmeticSwtich 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the operation = -,*,/,%");
		char c = scan.next().charAt(0);
		System.out.println("enter two numbers for ="+c);
		int a = scan.nextInt();
		int b =scan.nextInt();
		switch(c)
		{
		case '-':
		System.out.println("subtraction of two numbers ="+subtractNumbers(a,b));
		break;
		case '*':
		System.out.println("product of two numbers = "+multiplyNumbers(a,b));
		break;
		case '/':
		System.out.println("division of two numbers = "+divisionNumbers(a,b));
		break;
		case '%':
		System.out.println("remainder of two numbers = "+findRemainder(a,b));
		break;
		default:
			System.out.println("invalid operator is given");
			
		}
		scan.close();
	}
	static int subtractNumbers(int a,int b)
	{
		return a-b;
		
	}
	static int multiplyNumbers(int a,int b)
	{
		return a*b;
		
	}
	static double divisionNumbers(int a,int b)
	{
		return a/b;
		
	}
	static int findRemainder(int a,int b)
	{
		return a%b;
		
	}



	
	

}
