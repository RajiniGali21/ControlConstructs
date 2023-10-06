package Statements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the operation like :+,-,*,%");
		char c = scan.next().charAt(0);
		System.out.println("the operation is = "+c);
		if((c!='+')&&(c!='-')&&(c!='*')&&(c!='/'))
		{
			System.out.println("not eligible operation is taken");
		} 
		else
		{
		System.out.println("enter the two number for operation:"+c);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(c=='+')
		{
			System.out.println("sum of two number :"+(a+b));
		}
		else if(c=='-')
		{
			System.out.println("difference of two number :"+(a-b));
		}
		else if(c=='*')
		{
			System.out.println("product of two number :"+(a*b));
		}
		else if(c=='/')
		{
			System.out.println("division of two number :"+(a/b));
		}
		scan.close();
		}

	}

}
