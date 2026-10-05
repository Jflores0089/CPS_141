package chapter2MiscTopics;

import java.util.Scanner;
/*
 * This program provides examples of several miscellaneous topics
 * from Chapter 2
 * 
 * @author javierflores
 * 
 * Status: ???
 */

public class Chapter2MiscTopicsMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Combined assignment operators
		int x = 7;
		String s = "abc";
		
		System.out.println(x);
		
		x += 10;
		System.out.println(x);
		
		x *= 10;
		System.out.println(x);
		
		s += s;
		System.out.println(s);
		
		// The String class
		System.out.print("\nEnter a color: ");
		String userInput = keyboard.nextLine();
		System.out.println(userInput + " has " + userInput.length() + " character(s)");
		System.out.println(userInput + " starts with '" + userInput.charAt(0) + "'");
		
		//Issue when mixing nextLine() with other Scanner methods
		
		String name;
		int age;
		double weight;
		
		
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		System.out.print("Enter your weight");
		weight = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.print("What is your name?");
		name = keyboard.nextLine();
		
		
		System.out.printf("%s's age is %d and weight is %.2f",name, age, weight);
		
		
		
		
		// Standard exit
		System.out.println("\nExiting...");
		
	}

}
