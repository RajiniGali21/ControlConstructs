package com.in.elseifLadder;

import java.util.Scanner;

public class IdentifiesQuadrants {

	public static void main(String[] args) 
	{

				Scanner scan = new Scanner(System.in);
				System.out.println("enter the x-value = ");
				int x = scan.nextInt();
				System.out.println("enter the y-value = ");
				int y = scan.nextInt();
				whichQuadrant(x,y);
				scan.close();
			}

			private static void whichQuadrant(int x, int y)
			{
				{
			        if (x > 0 && y > 0)
			            System.out.println("lies in First quadrant");
			  
			        else if (x < 0 && y > 0)
			            System.out.println("lies in Second quadrant");
			  
			        else if (x < 0 && y < 0)
			            System.out.println("lies in Third quadrant");
			  
			        else if (x > 0 && y < 0)
			            System.out.println("lies in Fourth quadrant");
			  
			        else if (x == 0 && y > 0)
			            System.out.println("lies at positive y axis");
			  
			        else if (x == 0 && y < 0)
			            System.out.println("lies at negative y axis");
			  
			        else if (y == 0 && x < 0)
			            System.out.println("lies at negative x axis");
			  
			        else if (y == 0 && x > 0)
			            System.out.println("lies at positive x axis");
			  
			        else
			            System.out.println("lies at origin");
			    }
			}

		

	}


