package javierFlores;

/**
 * This program displays information about myself.
 * @author javierflores CPS 141 Exercise 1
 * Status: Working 
 */

public class JavierFloresMain {
    
	// This is the entry point for the program.
	public static void main(String[] args) {
		for (int i = 0; i < 85; i++) {
			System.out.print("*~");
		}
		
		//These are variables with their declared data type.
		int age = 37;
		String major = "Computer Science";
		String name = "Javier Flores";
		String pLanguages = "1 semester of C #, and a little bit of Python";
		
		//These 2 are different ways to represent the same data. This is also known as string interpolation.
		System.out.printf("\nHello! My name is %s",name);
		
		//Using empty println's to create white space.
		System.out.println();
		
		System.out.printf("\nMy age is %d", age);
		
		//Using empty println's to create white space.
		System.out.println();
		
		//This is an example of concatenation.
		System.out.println("\nThis is my " + 3 + "rd semester at Dutchess Community College");
		System.out.println("\nMy Experience with programming is " + pLanguages);
		
		//Something interesting things about myself.
		System.out.println("\nI am Comptia A+ and Network + certified");
		System.out.println("\nI also have a GitHub where i post my prior work in programming \n"
				+ "\nand plan to post more java as we progress in this class.");
		System.out.println("\nMy Github is https://github.com/Jflores0089 " + "- Check me out!");
		
		for (int i = 0; i < 85; i++) {
			System.out.print("*~");
		}
		
		System.out.print("\n\nExiting...");
	}

}
