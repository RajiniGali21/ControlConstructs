package Statements;
import java.util.Scanner;
public class OddEven 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int a = scan.nextInt();
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		scan.close();
	}

}
