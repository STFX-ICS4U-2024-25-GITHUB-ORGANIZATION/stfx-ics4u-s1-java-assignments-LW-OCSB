package ics3uLessons;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		// variables
		int num1 = 0;
		int remain = 0;
		Scanner sc = new Scanner(System.in);
		
		// input
		System.out.println("Welcome to odd/even calc.");
		System.out.println("Enter an integer: ");
		num1 = sc.nextInt();
		
		// processing
		remain = num1 % 2;
		
		if (remain > 0)  {
			
			System.out.println("Odd");
		}
		
		else  {
			
			System.out.println("Even");
		}
		
		// close Scanner
		sc.close();
	}

}
