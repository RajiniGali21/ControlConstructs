package Statements;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age = ");
		int a = scan.nextInt();
		if (a >=18)
			System.out.println("voting is eligible");
		else
			System.out.println("VOting is not eligible");
			scan.close();
	}

}
