package Statements;

import java.util.Scanner;

public class MessageConverter 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character = ");
		char c = scan.next().charAt(0);
		{
		System.out.println("MessageDecoder = "+messageDecoder(c));
		}
		scan.close();
	}


		
		
		
	

	 static int messageDecoder(char c)
	{
		return c;
	}

}


