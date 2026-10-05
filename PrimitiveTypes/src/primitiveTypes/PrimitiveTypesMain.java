
package primitiveTypes;

/**
 * @author javierflores CPS 141
 */

public class PrimitiveTypesMain {

	
	public static void main(String[] args) {
		byte bite = 12;
		short stuff = 14;
		int num =63;
		long johns = 200;
		char letter = 'J';
		float logs = 22.5f;
		double trunks = 25.5;
		boolean pass = true;
		
	bite = johns; 
	johns = bite;
	num = stuff;
	stuff = num;
	logs = bite;
	trunks = pass;
	bite = logs;
	letter = bite;
	bite = letter;
	letter = johns;
	johns = letter; 
	}

}
