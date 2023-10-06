package Statements;

import java.util.Scanner;

public class PtrProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principal =");
		int p = scan.nextInt();
		System.out.println("enter the time =");
		int t = scan.nextInt();
		System.out.println("enter the rate =");
		int r = scan.nextInt();
		System.out.println("SIMPLE INTEREST ="+calulatePtr(p,t,r));

		scan.close();
		
		
		}

	 static double calulatePtr(int p, int t, int r) 
	 {
		return ((p*t*r)/100);
	}

}
