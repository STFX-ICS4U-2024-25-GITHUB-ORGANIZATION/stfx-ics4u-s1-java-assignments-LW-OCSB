package ics3uLessons;

public class SwitchStatements {

	public static void main(String[] args) {

		// variables 
		int myInteger = 1;
		
		switch (myInteger)  {
		
			case 1:
				System.out.println("You entered 1.");
				System.out.println("Thank you.");
				break;
				
			case 2:
				System.out.println("You entered 2.");
				System.out.println("Thank you again.");
				break;
				
			case 3:
				System.out.println("You entered 3.");
				System.out.println("Thank you again and again.");
				break;
		
			default:
				System.out.println("You didn't enter 1-3.");
		}

	}

}
