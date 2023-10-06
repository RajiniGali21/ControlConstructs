package Loops;

import java.util.Scanner;

public class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int copyno = num;
		
		int sum=0;
		String count = Integer.toString(num);
		int length = count.length();
		while(num>0)
		{
			int remainder = num%10;
			sum += (int)Math.pow(remainder, length);
			length--;
			num = num/10;
		}
		if(copyno == sum)
		{
			System.out.println(sum+ " is disarium number");
		}
		else
		{
			System.out.println(sum+ " is not a disarium number");
		}
		scan.close();
		
		
	}

	

}
