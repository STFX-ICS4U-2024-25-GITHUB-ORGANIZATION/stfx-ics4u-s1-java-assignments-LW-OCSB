package ics3uLessons;

/*
 * DESIGN STRATEGY:
 * 
 * 1. Complete test plan.
 * 2. Code error case(s).
 * 3. Code smallest value for the ALGORITHM at-hand.
 * 4. Code smallest next bigger value for the ALGORITHM at-hand.
 * 
 */

public class Factorial {

	public static void main(String[] args) {

		System.out.println( factorial(3) );
	}

	// DESCRIPTION - Returns factorial of any integer >= 0, else -1.
	// PARAMETERS - int x
	// RETURN - int
	public static int factorial(int x) {
		
		// variable
		int answer = 1;
		
		// negative integers
		if (x < 0)
			return -1;
			
		// 0! and 1!
		if ((x == 0) || (x == 1))
			return answer;
		
		// (x > 1) !
		while(x > 1) {
			answer = answer * x;
			x = x - 1;
		}
		
		return answer;
		
	}
	
	
}
