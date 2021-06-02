package assignment;

import java.util.Scanner;

public class NumberSix {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a character");
		
		String userInput = input.next();
		char c = userInput.charAt(0);
		
		switch(c) {
		
			case 'a': 
			case 'A': System.out.println("this is a vowel");
			break;
			case 'e':
			case 'E': System.out.println("this is e vowel");
			break;
			case 'i': 
			case 'I': System.out.println("this is i vowel");
			break;
			case 'o': 
			case 'O': System.out.println("this is o vowel");
			break;
			case 'u': 
			case 'U': System.out.println("this is u vowel");
			break;
			default:  System.out.println("This is constant");
			break;
			
		}
		input.close();
	}
}
