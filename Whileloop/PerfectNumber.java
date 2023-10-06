package com.in.Whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		PerfectNumbers(num);
		scan.close();
	}

	 static void PerfectNumbers(int num) {
		int i=1;
		System.out.print("perfect numbers are ");
		while(i<=num) {
			if(isPrintPerfectNumbers(i)) {
				System.out.print(i+" ");
			}
			i++;
		}
		
	}

	static boolean isPrintPerfectNumbers(int num) {
		int sum = 0, i = 1;
		while (i < num) {
			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == num) 
		{
			return true;
		}
		return false;
	}

}


