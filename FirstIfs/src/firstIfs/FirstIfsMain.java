package firstIfs;
/*
 *This program introduces IF statements.
 * 
 * @author javierflores
 */
public class FirstIfsMain {

	public static void main(String[] args) {
		int a = 3,
		    b = 7,
		    c = 3;

	// Simple IF statement
	if (a > 0) {
		System.out.println("a > 0");
		System.out.println("Some more output");
	}	
	
	// IF-ELSE statement
	if (a == b) 
		System.out.println("a == b");
	else 
		System.out.println("a != b");
	
	// IF-ELSE-IF
	if (c < 0)
		System.out.println("c < 0");
	else if (c == 0)
		System.out.println("c == 0");
	else 
		System.out.println("c > 0");
	
	//Logical AND
	if (a >= b && a >= c)
		System.out.println(a);			
	else if (b >= c )
		System.out.println(b);
	else 
		System.out.println(c);
		
	 
	
	
	// Standard exit
	System.out.println("\nExiting...");
	
	}

}
