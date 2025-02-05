package ics3uLessons;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		
		// input
		System.out.println("Enter an integer: ");
		
		try {
		
			myInteger = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Invalid entry.");
		}
			
			
		// output
		System.out.println("You entered: " + myInteger);
		
		

	}

}
