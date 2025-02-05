package ics3uLessons;

public class Arrays {

	public static void main(String[] args) {

		// Java arrays use a single identifier (variable name)
		// Uses indexes (starting at 0)
		// Holds ELEMENTS of any SINGLE TYPE
		// Arrays are NOT dynamic (can't grow or shrink after creation)

		// SYNTAX:
		// dataType[] arrayIdentifier = new datatype[arraySize];
		
		// EXAMPLES:
		int[] myIntArray = new int[3];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[7];
		char[] myCharArray = new char[13];
		String[] myStringArray = new String[17];
		
		// We can initialize arrays with data upon creation:
		int[] myClassRoomNumbers = {140, 250, 222, 155};
		
		// Access room numbers:
		System.out.println(myClassRoomNumbers[0]);
		System.out.println(myClassRoomNumbers[1]);
		System.out.println(myClassRoomNumbers[2]);
		System.out.println(myClassRoomNumbers[3]);
		
		// Paycheque example:
		double[] myPayCheques = new double[6];
		
		// Add data to array:
		myPayCheques[0] = 150.14;
		myPayCheques[1] = 50.13;
		myPayCheques[2] = 180.84;
		myPayCheques[3] = 159.64;
		myPayCheques[4] = 80.44;
		myPayCheques[5] = 89.16;
		
		// add all pay for the year
		double payForYear = 0.0;
		
		// payForYear = myPayCheques[0] + myPayCheques[1] + myPayCheques[2]
		//		+ myPayCheques[3] + myPayCheques[4] + myPayCheques[5];
				
		// number of elements in array:
		System.out.println("Number of pay cheques: " + myPayCheques.length);

		// Use for-loop to add all paycheques
		for(int i=0; i<myPayCheques.length; i++)  {
			
			payForYear = payForYear + myPayCheques[i];
		}
			
		System.out.println("Annual Pay: $" + payForYear);
		
		// Attempting to access an element outside the length
		// of array will generate an Exception Error:

		//System.out.println(myPayCheques[6]);
		
	}

}
