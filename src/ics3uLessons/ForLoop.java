package ics3uLessons;

public class ForLoop {

	public static void main(String[] args) {
		
		// For loop will execute block of code
		// a known number of times
		for (int i=0; i<3; i++)  {
			
			System.out.println("Outer loop " + i);

			for (int j=0; j<3; j++)  {
				System.out.println("\tInner loop " + j);
			}
		
		}
		
		
		
	}

}
