package Statements;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter three numbers = ");
	int a=scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	//if(a<=b && a<=c)
	//{
		//System.out.println("a= "+a+ "is smallest");
		
	//}
	//else if(b<=a && b<=c)
	//{
		//System.out.println("b= "+b+"is smallest");
	//}
	//else if(c<=a && c<=b)
	//{
	//System.out.println("c= "+c+"is smallest");
	//}
	//scan.close();
	
	//}

//}
//	int temp,result;
//	temp=a>b?a:b;
	//result=temp>c?temp:c;
	//System.out.println(result+" is the greatest"); 
	
	//}
//}
	int smallest = a;
	if(b<smallest)
	{
		smallest=b;
	
		System.out.println("b = " +b+" is smallest");
	}
	if(c<smallest)
	{
		smallest=c;
	
		System.out.println("c = "+c+" is smallest");
	}
	else
	{
		System.out.println("a = "+a+" is smallest");
	}
	scan.close();
	}
}
