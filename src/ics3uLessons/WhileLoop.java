package ics3uLessons;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int numRepeats = 0;
		int counter = 0;
		
		// get number of repeats
		System.out.println("Enter how many repeats: ");
		numRepeats = sc.nextInt();
		
		// while loop used when we don't know the
		// number of times to repeat a block of code
		while ( counter <  numRepeats  )  {
			
			System.out.println("Hello World!");
			counter++;
		}

	}

}
