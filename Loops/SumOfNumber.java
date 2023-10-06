package Loops;
import java.util.Scanner;
public class SumOfNumber {
public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		sumOfDigits(num);
		scan.close();
	}
public static void sumOfDigits(int num) 
	{
		int r=0,sum=0;
		while(num>0)
		{
			r=num%10;
			sum+=r;
			num/=10;
		}
		System.out.println("Sum of given digit is = "+sum);
	}
}



