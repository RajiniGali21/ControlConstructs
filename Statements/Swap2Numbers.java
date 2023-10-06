package Statements;

public class Swap2Numbers {

	public static void main(String[] args) 
	{
		int x=20,y=30;
		System.out.println("***before swapping ***"); 
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("*after swapping ***");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x = "+x+" , y = "+y);
			
		}
	}


