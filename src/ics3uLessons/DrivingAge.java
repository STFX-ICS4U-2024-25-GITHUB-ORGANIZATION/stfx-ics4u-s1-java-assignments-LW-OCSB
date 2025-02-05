package ics3uLessons;

import java.util.Scanner;

public class DrivingAge {

	public static void main(String[] args) {

		// variables
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		// processing
		System.out.println("Driving age calculator.");
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		if (age >= 16)  {
			
			System.out.println("You're old enough to drive.");
		}
		
		else  {
			
			System.out.println("You're NOT old enough to drive.");
		}
  		
	}

}
