package ics3uLessons;

import java.util.Scanner;

public class PredefinedMethods {

	public static void main(String[] args) {
		
		// Predefined methods are code or commands written
		// by Java developers, for use by Java users.
		// These methods are used to within Java programs to
		// solve simple or complex tasks.  The implementation
		// of these methods are "encapsulated", such that we
		// can not see them.
		
		// Java methods are contained inside "classes"
		// Need to import "classes" to use methods.
		// Exceptions are Math and String classes, because
		// they're so common.
		
		// MATH METHODS:
		
		// When using methods which returns values, must:

		// 1. Print it:
		System.out.println(Math.toRadians(360.0));
		
		// 2. Assign to a variable:
		double myAnswer = Math.toRadians(360.0);
		
		// 3. Use it (i.e. in a calculation)
		double myAnswer2 = 13 + Math.toRadians(360.0);
		
		System.out.println(Math.max(13,  7));
		
		
		// STRING METHODS
		
		String myString = "Hello World!";
		
		System.out.println(myString.equals("foo"));
	
		if (myString.equals("foo"))  {
			
			System.out.println("True, do stuff ...");
		}
		
		else  {
			
			System.out.println("False, do other stuff ...");
		}
		
		
	
		
		
		
		
	}

}
