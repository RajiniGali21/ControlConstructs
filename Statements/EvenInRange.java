package Statements;

import java.util.Scanner;

public class EvenInRange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=100;i++)
			//if(i%2==0)
			if(i%2!=0)
			{
				//System.out.println("even numbers form 1 to 100 = "+(i));
				System.out.print( +i+ " ");
				scan.close();
			}
	}

}
