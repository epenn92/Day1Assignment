package assignment;

import java.util.Scanner;

public class NumberOne {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("ISBN?");
	
	int isbn = userInput.nextInt();
	
	userInput.nextLine();
	
	System.out.println("name?");
	
	String name = userInput.nextLine();
	
	System.out.println("price?");
	
	float price = userInput.nextFloat();
	
	System.out.println("author?");
	
	String author = userInput.nextLine();
	
	userInput.nextLine();
	
	System.out.println("copies printed?");
	
	double copies = userInput.nextDouble();
	
	System.out.println("ISBN: " + isbn + "\nname: " + name + "\nauthor: " + author + 
			"\nprice " + price + "\ncopies printed: " + copies);
	}
	
}
