package ics3uLessons;

public class DoWhileLoop {

	public static void main(String[] args) {

		// variables
		int numRepeats = 3;
		int counter = 0;

		// Do-while loop is similar to while loop.
		// Executes block of code AT LEAST once.
		// Boolean condition checked after code block.
		do  {
			System.out.println("Hello World!");
			counter++;
			
		}  while (counter < numRepeats);
		
	}

}
