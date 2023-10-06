package Statements;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the marks = ");
		int a = scan.nextInt();
		if(a>=90)
		{
			System.out.println("*****WELCOME TO TECH CLUB******");
		}
		scan.close();
	}

}
