package com.in.elseifLadder;

import java.util.Scanner;

public class AcceptsCharacter {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character = ");
		char c = scan.next().charAt(0);
		identifies(c);
		scan.close();
	}

	private static void identifies(char c) 
	{
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("upper case vowel");
		}
		else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("lower case vowel");
		}
		else if(c!='A'||c!='E'||c!='I'||c!='O'||c!='U')
		{
			System.out.println("upper case consonant");
		}
		else if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u')
		{
			System.out.println("lower case consonant");
		}
		else if(c>=0&&c<=9)
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("Special character");
		}
			


	}

}
