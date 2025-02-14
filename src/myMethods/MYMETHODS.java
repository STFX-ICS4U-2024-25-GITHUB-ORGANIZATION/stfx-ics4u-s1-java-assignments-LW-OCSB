package myMethods;

public class MYMETHODS {

	
	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETERS - NA
	// RETURN TYPE - void
	public static void helloWorld()  {
		
		System.out.println("Hello World!");
	}

	
	// DESCRIPTION - Rounds double (x) to specified (y) number of decimal places
	// PARAMETERS - double x, int y
	// RETURN TYPE - double
	public static double roundDouble(double x, int y)  {
		
		x = Math.round(x * Math.pow(10, y));
		return(x / Math.pow(10, y));
	}
	
}
