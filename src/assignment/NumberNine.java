package assignment;
import java.util.Scanner;

public class NumberNine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number");
		
		int userInput = input.nextInt();
		
		if(userInput <= 1) {
			System.out.println(userInput + " is not a prime number");
			input.close();
			return;
		}
			
		
		for(int i = 2; i <= userInput / 2; i++) {
			if( userInput % i == 0) {
				System.out.println(userInput + " is not a prime number");
				input.close();
				return;
			}
		}
		System.out.println(userInput + " is prime number");
		
		input.close();
	}
}
