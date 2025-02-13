package myMethods;

public class MYMETHODS {

	
	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETERS - NA
	// RETURN TYPE - void
	public static void helloWorld()  {
		
		System.out.println("Hello World!");
	}

	
	// DESCRIPTION - Rounds double (x) to specified (y) number of decimal places
	// PARAMETERS - double x, double y
	// RETURN TYPE - double
	public static double roundDouble(double x, double y)  {
		
		y = Math.pow(10, y);
		x = x * y;
		x = Math.round(x);
		return(x / 100);
	}
	
}
