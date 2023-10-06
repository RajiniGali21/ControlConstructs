package Statements;
import java.util.Scanner;
public class Equal {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter a value = ");
			int a = scan.nextInt();
			System.out.println("enter b value = ");
			int b = scan.nextInt();
			if(a==b)
				System.out.println("a and b are equal");
			else
				System.out.println("a and b are not equal");
			scan.close();
	}

}
