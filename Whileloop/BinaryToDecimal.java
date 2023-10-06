package com.in.Whileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the binary number = ");
		 //String n = scan.next();
//		 int decimal = binaryToDecimal(n);
//		 System.out.println(decimal+" binary to decimal");
//		 scan.close();
//	}
//
//	private static int binaryToDecimal(String n) 
//	{
//		int decimal = 0;
//		int power=0;
//		int i= n.length()-1;
//		while(i>=0)
//		{
//			char c =  n.charAt(i);
//			int bit = c-'0';
//			decimal += bit*Math.pow(2, power);
//			power++;
//			i--;
//		}
//		return decimal;
//	}
//
//}
		    long n = scan.nextLong();
			int decimal = frequencyOfDigits(n);
			System.out.println("decimal number of " +n+ " is " +decimal);
			scan.close();
		}

		static int frequencyOfDigits(long n) {
			int decimalNumber=0,i=0;
			while(n!=0)
			{
				long r=n%10;
				n/=10;
				decimalNumber+=r*Math.pow(2,i);
				i++;
			}
			
			return decimalNumber;
		}

	}
