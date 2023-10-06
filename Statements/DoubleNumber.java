package Statements;

import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = scan.nextInt();
	     int Doubleofnumber =  doubleTheNumber(a);
	     System.out.println("double of given number is = "+(Doubleofnumber));
		scan.close();
		}

	 static int doubleTheNumber(int a) 
	 {
		return a+a;
	}

	

}
