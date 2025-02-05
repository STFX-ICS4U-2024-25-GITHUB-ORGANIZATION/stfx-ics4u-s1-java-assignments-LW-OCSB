/*

PROBLEM - Express a given number of seconds in terms of hours, mins and seconds.

EXAMPLE - Enter 9331 seconds.  Program outputs number of hours, mins and seconds
that this represents.

HIGH LEVEL PSEUDO-CODE (English-steps)

1. Get number of seconds from user.
2. Calculate number of hours.
3. Calculate number of minutes.
4. Calculate number of seconds.
5. Display the number of hours, minutes and seconds.

DETAILED PSEUDO-CODE (still English, but more detail)

1. Get number of seconds from user.

2. Calculate number of hours:

	- divide number of seconds by 3600

3. Calculate number of seconds remaining:

	- number of seconds % 3600
	
4. Calculate number of minutes:

	- number of seconds remaining / 60
	
5. Calculate number of second:

	- number of seconds remaining % 60
	
6. Output hours, minutes and seconds.
	
*/

package ics3uLessons;
import java.util.Scanner;

public class AlgorithmDesign {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int numberOfSeconds = 0;
		int hours = 0;
		int secondsRemaining = 0;
		int minutes = 0;
		int seconds = 0;
		
		// get seconds from user
		System.out.println("Enter number of seconds: ");

		try {
			numberOfSeconds = sc.nextInt();
		}
		
		catch (Exception e) {
			System.out.println("Enter integer number of seconds.");
		}

		// number of hours
		hours = numberOfSeconds / 3600;
		
		// seconds remaining
		secondsRemaining = numberOfSeconds % 3600;
				
		// number of minutes
		minutes = secondsRemaining / 60;
		
		// number of seconds
		seconds = secondsRemaining % 60;
	
		// output results
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}

}







