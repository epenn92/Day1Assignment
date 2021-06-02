package assignment;
import java.util.Scanner;

public class NumberTen {

	static double sum = 1;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("pick a number");
		double userInput1 = input.nextDouble();
		System.out.println("pick an exponent");
		double userInput2 = input.nextDouble();
		getPower(userInput1, userInput2);
		System.out.println(sum);
		input.close();
	}
	
	public static double getPower(double x, double y) {
		
		if(y == 0)
			return sum;
		sum = sum * x;
		getPower(x, y - 1);
		return sum;
	}
}
