package ics3uLessons;

public class Methods {
	
	public static void main(String[] args) {
		
		System.out.println(max(13, 13));
		
		String myString = "";
		String string1 = "Hello ";
		String string2 = "World!";
		myString = combineStrings(string1, string2);
		System.out.println(myString);
		
		displayMenu();
	}
	
	// DESCRIPTION - Displays menu for program.
	// PARAMETERS - none
	// RETURN TYPE - void
	public static void displayMenu()  {
		
		System.out.println("Welcome to my program.");
		System.out.println("Option 1...");
		System.out.println("Option 2...");
		System.out.println("Option 3...");
	}

	
	// DESCRIPTION - Returns the combination of two Strings.
	// PARAMETERS - String a, String b
	// RETURN TYPE - String
	public static String combineStrings(String a, String b)  {
		
		return a+b;
	}
	
	
	
	// DESCRIPTION - Returns the greater of two int values.
	// PARAMETERS - int a, int b
	// RETURN TYPE - int
	public static int max(int a, int b)  {
		
		if (a>b)
			return a;
		
		else
			return b;
	}
	
	// DESCRIPTION - Returns the greater of two double values.
	// PARAMETERS - double a, double b
	// RETURN TYPE - double
	public static double max(double a, double b)  {
			
		if (a>b)
			return a;
		
		else
			return b;
	}
	
	
}
