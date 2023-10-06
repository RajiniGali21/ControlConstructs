package Statements;
import java.util.Scanner;
public class GradingSystem {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter marks = ");
		int a = scan.nextInt();
		if(a>=90)
		{
			System.out.println("A Grade");
		}
		else if (a>75&&a<=90)
		{
			System.out.println("B Grade");
		}
		else if(a>50&&a<=75)
		{
			System.out.println("C Grade");
		}
		else if(a>35&&a<=50)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("one more attempt");
		}
		scan.close();
		
	}

}
