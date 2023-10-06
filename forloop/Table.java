package com.in.forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr the number = ");
		int num = scan.nextInt();
	    int table = printTable(num);
		{
			System.out.print(table+" ");
		}
		scan.close();
	}

	private static int printTable(int num) 
	{
		for(int i=1;i<=10;i++)
//		{
//			System.out.print(num*i+" ");
//		}
		{
			num = num*i;
			
		}
        return num;
        
	
	

}
}
