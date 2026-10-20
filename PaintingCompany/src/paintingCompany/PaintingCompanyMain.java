package paintingCompany;

import java.util.Scanner;

/**
 * This program calculates the price with tax for the users choice of paint and size.
 * @author Javier_Flores
 * Status: Working
 */

public class PaintingCompanyMain {
	
	// Variables with literals that need to remain constant and unchanging.
	final static double O = 3.50;
	final static double B = 5.00;
	final static double G = 100.00;
	final static double TAXRATE = .08;
	
	// Entry point to our program.
	public static void main(String[] args) {
		
		// Scanner is used to take input from user and store it into a variable.
		Scanner keyboard = new Scanner(System.in);
		
		// Variable that will store paint price
		double paintPrice = 0;
					
		// Variable that will store amount before tax
		double totalPrice;
						
		// Variable that will store the amount of tax for the selection
		double taxOnTotal;
				
		// Variable that will store users choice of paint
		char userPaintChoice = 0;
				
		// Variable that will control the loop
		boolean isValid = true;
		
		// Entry prompts to user introducing the company and our offers
		System.out.println("Welcome to the Java Painting Company!");
		System.out.println("We have three types of paint: Ok, Better, and Great.\n");
		
		// Listing prices to user
		System.out.println("The prices for paint are:\n\n$3.50/sqft for Ok paint"
						   			  			  + "\n$5.00/sqft for Better paint"
						   			  			  + "\n$100.00/sqft for Great paint");
		
		// Asking user for name
		System.out.print("\nFirst, what is your name?");
		
		// Variable used to store user name
		String userName = keyboard.nextLine();
		
		// Getting the user ready to input values
		System.out.printf("\nHello %s! Lets get started! We will start with some measurements.\n",userName);
		
		// Variables where we will store user data.
		System.out.print("\nWhat is the height? ");
		double height = keyboard.nextDouble();
		
		System.out.print("\nWhat is the length? ");
		double length = keyboard.nextDouble(); 
		
		System.out.print("\nWhat is the width? ");
		double width = keyboard.nextDouble();
		
		// Calculating perimeter which is needed for wall square foot total.
		double perimeter = (length + width) * 2 ;
		
		// Calculating square ft
		double totalSquareFt = perimeter * height;
		
		// Loop to ask user for valid paint selection in the case user selects invalid input
		while (isValid == true) {
		
		// Prompting user for choice of paint
		System.out.println("\nWhat type of paint would you like?\n\nPlease type: 'O' for ok paint, "
				         + "'B' for better paint and 'G' for great paint.");
		
		// Variable that will store users choice of paint
		 userPaintChoice = keyboard.next().toUpperCase().charAt(0);
		
		// Storing paint price based on user selection
				if (userPaintChoice == 'O') {
					   paintPrice = O;
					   isValid = false;
				}
					else if (userPaintChoice == 'B') {
						paintPrice = B;
						isValid = false;
					}
						else if (userPaintChoice == 'G') {
							paintPrice = G;
							isValid = false;
						}
							else {
								System.out.printf("Sorry '%c' is not a valid selection.\n\n",userPaintChoice);
								isValid = true;
							}
		}
		
		// Calculating tax on user selection and storing total price with tax included					
		totalPrice = paintPrice * totalSquareFt;
		
		taxOnTotal = totalPrice * TAXRATE;
		
		totalPrice += taxOnTotal;
		
		// For loop used to add stylistic line separation
		for (int i = 0; i < 40; ++i) {
			System.out.print("~*~");
		}
		
		// Showing the user what they have input and total sqft
		System.out.printf("\nYour measurements are:\n\nHeight = %.2f\nLength = %.2f\nWidth  = %.2f\n\n"
				+ "Your total sqft is: %.2f\n\n"		
				+ "Your choice of paint is: '%c'\n",height,length,width,totalSquareFt,userPaintChoice);
		
		// Telling the user the tax rate
		System.out.printf("\nThe tax rate is: %.2f%%",TAXRATE * 100);
		
		// Telling the user total before tax
		System.out.printf("\nYour total before tax: $%,.2f", paintPrice * totalSquareFt);
		
		// Telling user total after tax
		System.out.printf("\nYour total after  tax: $%,.2f\n",totalPrice);
		
		// Final parting statement
		System.out.println("\nThanks for choosing the Java Painting Company!");
		
		// For loop used to add stylistic line separation
		for (int i = 0; i < 40; ++i) {
			System.out.print("~*~");
		}
		
		// Closing scanner
		keyboard.close();
		
		// Standard exit
		System.out.println("\n\nExiting...");
	}

}
