package Statements;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = scan.nextInt();
		int Square =squareofNum(a);
		{
			System.out.println("square of given number is :"+Square);
		}
		scan.close();
	}

	static int squareofNum(int num) 
	{
		return num*num;
	}
	

}
