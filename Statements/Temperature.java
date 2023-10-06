package Statements;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the temperature in fahrenheit = ");
		double fahrenheit = scan.nextDouble();
		double Celsius = temperatureInFahrenheit(fahrenheit);
		System.out.println("celsius temperature = "+(Celsius));
		scan.close();
		
	}


	private static double temperatureInFahrenheit(double fahrenheit) 
	{
		return ((fahrenheit-32)*5)/9;
	}

	}
