package assignment;

public class NumberFour {

	static int x = 5;
	static int y = 10;
	
	public static void main(String[] args) {
		System.out.println("x: " + x + " y: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x: " + x + " y: " + y);

	}
}
