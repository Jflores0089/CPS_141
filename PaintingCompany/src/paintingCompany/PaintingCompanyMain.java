package paintingCompany;

import java.util.Scanner;

/**
 * This program calculates the price with tax for the users choice of paint and size.
 * @author javierflores
 * Status: ?
 */

public class PaintingCompanyMain {
	
	// Variables with literals that need to remain constant and unchanging.
	final static double OK_PAINT = 3.50;
	final static double BETTER_PAINT = 5.00;
	final static double GREAT_PAINT = 100.00;
	final static double TAXRATE = .008;
	
	// Entry point to our program.
	public static void main(String[] args) {
		
		//Scanner is used to take input from user and store it into a variable.
				Scanner keyboard = new Scanner(System.in);
		
		// Entry prompts to user introducing the company and our offers
		System.out.println("Welcome to the Java Painting Company!");
		System.out.println("We have three types of paint. Ok, Better, and Great.");
		System.out.println("What type of paint would you like? \nPlease type: 'O' for Ok paint, "
				+ 		   "'B' for Better paint and 'G' for great paint.");
		
		// Variable that will store users choice of paint.
		char userPaintChoice = keyboard.next().charAt(0);
		
		if (userPaintChoice = o)
		
		// Variables where we will store user data.
		double height = keyboard.nextDouble();
		double length = keyboard.nextDouble(); 
		double width = keyboard.nextDouble();
		
		// Calculating perimeter which is needed for wall square foot total.
		double perimeter = (length + width) * 2 ;
		
		//
		double totalSquareFt = perimeter * height;
		
		// Standard exit
		System.out.println("/nExiting...");
		
		
		
		
		
		
	}

}
