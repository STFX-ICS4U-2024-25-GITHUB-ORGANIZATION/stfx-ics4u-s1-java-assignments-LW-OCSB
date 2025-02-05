package ics3uLessons;
import java.util.Scanner;

public class Debugger {

	public static void main(String[] args) {

		// variables
		int foo = 0;
		int bar = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		// input
		System.out.println("Enter number for \"foo\": ");
		foo = sc.nextInt();
		System.out.println("Enter number for \"bar\": ");
		bar = sc.nextInt();
		
		// processing
		sum = foo + bar;
		
		// output
		System.out.println("Sum is: " + sum);
		
	}

}
