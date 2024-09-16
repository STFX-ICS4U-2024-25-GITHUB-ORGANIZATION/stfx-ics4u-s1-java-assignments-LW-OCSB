
public class ProblemThree {

	// return the middle character of a String
	public static void main(String[] args) {

		String myString = "ABCDEF";
		
		System.out.println( findMiddle(myString) );
	}

	// DESCRIPTION - Returns the middle character of a String
	// PARAMETERS - String s
	// RETURN TYPE - String
	public static String findMiddle(String s)  {
		
		int middleIndex = 0;
		String middleChar = "";
		
		
		// String is even length, return middle 2 characters
		if (s.length() % 2 == 0)  {
				
			middleIndex = s.length() / 2 - 1;
			return s.substring(middleIndex, middleIndex + 2);
		}
			
		//String is odd length, return middle character
		else {
				
			middleIndex = s.length() / 2;
		    return s.substring(middleIndex, middleIndex + 1);
		}        
			
	}
	
}
