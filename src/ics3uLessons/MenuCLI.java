package ics3uLessons;
import java.util.Scanner;

public class MenuCLI {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		
		do  {
			
			System.out.println("Welcome to Bank!");
			System.out.println("Menu: ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Return card");
			System.out.println("Enter selection: ");
		
			// assume only 1-4 can be entered
			userChoice = sc.nextInt();
			
			if (userChoice == 1)  {
				System.out.println("Do deposit task ...");
			}
			
			else if (userChoice == 2)  {
				System.out.println("Do withdraw task ...");
			}
			
			else if (userChoice == 3)  {
				System.out.println("Do balance task ...");
			}
			
			else  {
				
				System.out.println("Exiting ...");
			}
			
		}  while (userChoice != 4);
		
		System.out.println("Please take card.");
	}

}
