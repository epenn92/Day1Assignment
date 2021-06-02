package assignment;
import java.util.Scanner;

public class NumberSeven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a year");
		
		int userInput = input.nextInt();
		
//		boolean leap = false;
		
		if ((userInput % 4 == 0) && (userInput % 100 != 0) || (userInput % 400 == 0))
			System.out.println("Leap Year");	
		else 
			System.out.println("Not a leap year");
		
		input.close();
	}
}
