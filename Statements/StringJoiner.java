package Statements;
import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first name =");
		String firstname = scan.nextLine();
		System.out.println("enter the second name =");
		String lastname = scan.nextLine();
		String fullname = stringJoiner(firstname,lastname);
		
		{   
			System.out.println("joining of first name and last name ="+fullname);
			
		}
		scan.close();
		
		
		
		
	}



	private static String stringJoiner(String firstname,String lastname) {
		// TODO Auto-generated method stub
		return firstname+" "+lastname;
	}

}
