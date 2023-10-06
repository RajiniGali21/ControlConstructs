package Statements;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter value =");
		int a = scan.nextInt();
		if(a>0)
			System.out.println("Given value is positive");
		else 
			System.out.println("Given value is negative");
		scan.close();
	}

}
