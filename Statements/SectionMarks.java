package Statements;

import java.util.Scanner;

public class SectionMarks {

	public static void main(String[] args)
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the marks = ");
			int a = scan.nextInt();
			if(a>95)
			{
				System.out.println("***they will do master in ai****");
			}
			else if(a<75 && a>95)
			
			{
			System.out.println("***IOT****");	
			}
			else if(a<65 && a>75)
			{
				System.out.println("****NEURAL NETWORKS***");
			}
			else if(a>65 && a<45)
			{
				System.out.println("****QUANTUM COMPUTING*****");
			}
			else
			{
				System.out.println("***IT JOBS***");
			}
			scan.close();
			
	}

}
