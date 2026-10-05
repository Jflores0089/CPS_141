package firstVariables;
/*
 * @author CPS 141 Class
 * 
 * Status:
 */
public class FirstVariablesMain {

	public static void main(String[] args) {
		int age;		// The age of the character
		double weight;  // The weight of the character
		String name;	// The name of the character
		
		//Assign values to first character
		name = "Jem";
		age = 10;
		weight = 112.7;
		
		//Display first character information
		System.out.println("Name: " + name);
		System.out.println("Age; "+ age);
		System.out.println("Weight: " + weight);
		
		//Assign values to second character
				name = "Scout";
				age = 6;
				weight = 50.5;
				
		//Display second character information
		System.out.println("\nName: " + name);
		System.out.println("Age; "+ age);
		System.out.println("Weight: " + weight);

		
		// Standard exit
		System.out.println("\nExiting...");
	}

}
