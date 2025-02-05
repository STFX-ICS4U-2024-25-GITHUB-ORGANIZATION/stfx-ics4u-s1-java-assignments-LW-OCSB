package ics3uLessons;

import java.util.Scanner;     // importing Java class to get user input

public class AddCalculator {

	public static void main(String[] args) {
		
		// variables
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);    // scanner object
		
		// get user input
		System.out.println("Welcome to ADD calculator!");
		System.out.println("\nEnter first number: ");
		num1 = sc.nextInt();
		System.out.println("\nEnter second number: ");
		num2 = sc.nextInt();
		
		// processing
		sum = num1 + num2;
		
		// output
		System.out.println("ANSWER: " + sum);
	}

}
