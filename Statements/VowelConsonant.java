package Statements;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter character = ");
		char c = scan.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("given character is vowel");
		}
		else
		{
			System.out.println("given character is consonant");
		}
		scan.close();
	}

}
