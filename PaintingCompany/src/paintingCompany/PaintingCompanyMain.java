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
		
		// Variables where we will store user data.
		double height = keyboard.nextDouble();
		double length = keyboard.nextDouble(); 
		double width = keyboard.nextDouble();
		
		// Calculating perimeter which is needed for wall square foot total.
		double perimeter = length + length + width + width;
		
		//
		double totalSquareFt = perimeter * height;
		
		
		
		
		
		
	}

}
