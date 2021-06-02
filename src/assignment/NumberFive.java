package assignment;
import java.util.Scanner;

public class NumberFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a character");
		
		String userInput = input.next();
		char c = userInput.charAt(0);
		
		if((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') ||
				(c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')) 
			System.out.println("this is a vowel");
		else 
			System.out.println("This is a consonant");
		input.close();
	}
}
