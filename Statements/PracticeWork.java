package Statements;
import java.util.Scanner;
public class PracticeWork {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//System.out.println("enter the number: ");
			//int a = scan.nextInt();
			//if (a=10)
			//if (a== 20)
			System.out.println("enter the boolean value = ");
			boolean b = scan.nextBoolean();
			
			if(b==true)
			
				System.out.println("b is equal");
			else
				System.out.println("b is not equal");
			
			scan.close();
	}

}
