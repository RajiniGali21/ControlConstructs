package Loops;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) 
	{
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number");
    int n=scan.nextInt();
    int firstNumber =0,secondNumber=1;
    int nextNumber;
    System.out.print(firstNumber+" "+secondNumber+" ");
    for(int i=3;i<=n;i++) 
    {
    nextNumber = 	firstNumber+secondNumber;
    System.out.print(nextNumber+" ");
    firstNumber = secondNumber;
    secondNumber = nextNumber;
    }
    scan.close();
	}

}
