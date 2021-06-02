package assignment;

public class NumberThree {

	static int num1 = 1;
	static int num2 = 2;
	static int temp = 0;
	
	public static void main(String[] args) {
		System.out.println(num1 + " " + num2);
		temp = num1; num1 = num2; num2 = temp;
		System.out.println(num1 + " " + num2);
	
	}
}
