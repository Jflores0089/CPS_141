package quizAverage;
import java.util.Scanner;
/*
 * @author javierflores CPS 141
 * Description: Program that takes average score of 3 quizzes.
 * Status: Working
 */

public class QuizAverageMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello what is your name?");
		String name = keyboard.nextLine();
		System.out.print("What are your 3 quiz grades?");
		
		//Initialize quiz scores
		int quiz1 = keyboard.nextInt();
		int quiz2 = keyboard.nextInt();
		int quiz3 = keyboard.nextInt();
		
		//Calculate the quiz average;
		final int NUM_OF_QUIZZES = 3;
		double Avg = (quiz1 + quiz2 + quiz3) / NUM_OF_QUIZZES;
	
		//Display quiz scores
		System.out.printf("\nThese are the %s's scores and their quiz average:",name);
		System.out.printf("\n%s's quiz score 1 = %d out of a possible 10",name, quiz1);
		System.out.printf("\n%s's quiz score 2 = %d out of a possible 10",name, quiz2);
		System.out.printf("\n%s's quiz score 3 = %d out of a possible 10",name, quiz3);
		System.out.printf("\nThe Average test score is %.2f", Avg);
		
		keyboard.close();
		
		// Standard exit
		System.out.println("\nExiting...");	
	}

}
