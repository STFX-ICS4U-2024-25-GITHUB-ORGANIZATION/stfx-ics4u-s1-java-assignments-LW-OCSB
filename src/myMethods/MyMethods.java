package myMethods;

public class MyMethods {

	
	
	// DESCRIPTION - Swaps elements x and y in array.
	// PARAMETERS - int[] a, int x, int y
	// RETURN - void
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	
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
