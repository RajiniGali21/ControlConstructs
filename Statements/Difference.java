package Statements;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter a value = ");
			int a =scan.nextInt();
			System.out.println("enter b value = ");
			int b = scan.nextInt();
			if(a>b)
				System.out.println("the difference of a and b = "+(a-b));
			else
				System.out.println("difference of b and a = "+(b-a));
			scan.close();
	}

}
