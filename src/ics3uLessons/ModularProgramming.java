package ics3uLessons;
import java.util.Scanner;

public class ModularProgramming {

	// PROGRAM DESCRIPTION - Calculates average of 6 marks, then determines
	//						 if user meets minimum requirements for a program.
	// PARAMETERS - String[] args
	// RETURN TYPE - void
	public static void main(String[] args) {

		// variables
		final int NUM_MARKS = 6;
		final int MINIMUM_GRADE = 75;
		int[] marks = new int[NUM_MARKS];
		int average = 0;
		boolean accepted = false;
		
		// get marks (method 1)
		marks = getMarks(NUM_MARKS);
		
		// calculate average (method 2)
		average = calculateAverage(marks);
		
		// check if they get in program (method 3)
		accepted = determineAcceptance(average, MINIMUM_GRADE);
		
		// break the news (method 4)
		outputResult(accepted);
		
	}

	
	// PROGRAM DESCRIPTION - Obtains n marks from user.
	// PARAMETERS - int n
	// RETURN TYPE - int[]
	public static int[] getMarks(int n)  {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int[] grades = new int[n];
		
		// get grades
		for (int i=0; i<n; i++)  {
			
			System.out.println("Enter grade " + (i+1) + ": ");
			grades[i] = sc.nextInt();
		}
		
		return grades;
	}
	
	
	// PROGRAM DESCRIPTION - Returns average of int[n]
	// PARAMETERS - int[] a
	// RETURN TYPE - int
	public static int calculateAverage(int[] a)  {
		
		// variables
		int sum = 0;
		int mean = 0;

		// calculate sum
		for(int i=0; i<a.length; i++)  {

			sum = sum + a[i];
		}
		
		// calculate average
		mean = sum / a.length;
		
		return mean;
	}
	
	// PROGRAM DESCRIPTION - Determines if user is accepted to program.
	// PARAMETERS - int average, int minimumGrade
	// RETURN TYPE - boolean
	public static boolean determineAcceptance(int average, int minimumGrade)  {
		
		if (average >= minimumGrade)
			
			return true;
		
		else
			return false;
	}
	
	
	// PROGRAM DESCRIPTION - Displays result of acceptance to user.
	// PARAMETERS - boolean b
	// RETURN TYPE - void
	public static void outputResult(boolean b)   {
		
		if (b == true)
			
			System.out.println("Accepted!");
		
		else
			
			System.out.println("Not accepted!");
	}
	
}
