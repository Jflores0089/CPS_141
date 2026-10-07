package chapter3QuizGrades;
import java.util.Scanner;
/**
 * @author javierflores
 */

public class Chapter3QuizGradesMain {
	static final int MINIMUM_SCORE = 0;
	static final int MAXIMUM_SCORE = 20;
	
	public static void main(String[] args) {
		int  quizScore;			//Numeric score of a quiz-keyboard
		char quizGrade;			//Letter grade of a quiz = calculated
		Scanner keyboard = new Scanner(System.in);
		
		// Get score for user
		System.out.printf("Enter quiz score (%d - %d): ",MINIMUM_SCORE,MAXIMUM_SCORE);

		quizScore =keyboard.nextInt();
		
		// Determine if score is valid - display error message if not
		if (quizScore < MINIMUM_SCORE || quizScore > MAXIMUM_SCORE)
			System.out.printf("ERROR! %d is invalid!", quizScore);
		else {
			if (quizScore >= 19)
				(quizGrade) = 'A';
			else if (quizScore >= 17)
				 (quizGrade) = 'B';
			else if (quizScore >= 15)
				 (quizGrade) = 'C';
			else if (quizScore >= 13)
				 (quizGrade) = 'D';
			else 	(quizGrade) = 'F';
			
			// Display results
			System.out.printf("\nQuiz score: %d and Letter grade: %c",quizScore,quizGrade);
					
		}	
		
		//Standard exit
		System.out.println("\nExiting...");
	}

}
