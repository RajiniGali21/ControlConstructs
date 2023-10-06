package Statements;
import java.util.Scanner;
public class Vibgyor {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the alphabet = ");
	char c = scan.next().charAt(0);
	switch(c)
	{
	case 'v':
	case 'V':
		System.out.println("VIOLET COLOR");
		break;
	case 'i':
		System.out.println("INDIGO COLOR");
		break;
	case 'b':
	case 'B':	
		System.out.println("BLUE COLOR");
		break;
	case 'g':
	case 'G':	
		System.out.println("GREEN COLOR");
		break;
	case 'y':
	case 'Y':
		System.out.println("YELLOW COLOR");
		break;
	case 'o':
	case 'O':	
		System.out.println("ORANGE COLOR");
		break;
	case 'r':
	case 'R':
		System.out.println("RED COLOR");
		break;
	default:
		System.out.println("INVALID COLOR");
		
	}
	System.out.println("---->THE END<----");
	scan.close();
	}

}
