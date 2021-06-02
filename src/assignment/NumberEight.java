package assignment;
import java.util.Scanner;

public class NumberEight {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number");
		
		double userInput = input.nextDouble();
		
		if(userInput >= 0) 
			System.out.println("Positive number");
		else 
			System.out.println("Negative number");
		
		input.close();
	}
	
}
