package ics3uLessons;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userEntry = "";
		boolean stageChecked = false;
		
		// stage 1
		while (stageChecked == false)  {
			
			System.out.println("Enter a String greater than 6 chars: ");
			userEntry = sc.next();
			stageChecked = stageOne(userEntry);
		}
		
		

	}
	
	// DESCRIPTION - User must enter a string that is greater than 6 characters.
	// PARAMETERS - String S
	// RETURN TYPE - boolean
	public static boolean stageOne(String s)  {
		
		if (s.length() > 6)
			return true;
		
		else
			return false;
	}
	

}
