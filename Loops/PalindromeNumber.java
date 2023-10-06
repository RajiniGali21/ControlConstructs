package Loops;
import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int r=0,sum=0,temp=num;
		while(num>0)
		{
			r=num%10;
			sum = sum*10+r;
			num=num/10;
			scan.close();
		}
		if(sum==temp)
		{
			System.out.println("given is number " +temp+ " is palindrome");
		}
			else
			{
				System.out.println("given number is  " +temp+ " is not a palindrome");
			}
		}
	
	}


