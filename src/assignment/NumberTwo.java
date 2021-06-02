package assignment;
import java.util.Scanner;

public class NumberTwo {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Pick a number");
	
	int num1 = userInput.nextInt();
	
	System.out.println("pick a divisor");
	
	int num2 = userInput.nextInt();
	
	int math = num1/num2;
	
	int remainder = num1%num2;
	
	System.out.println("quotient: " + math + " remainder: " + remainder);
	}
	
}
