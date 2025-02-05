package ics3uLessons;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String dietaryChoice = "";
		String vegetarianOption = "";
		String meatOption = "";
		
		// get user dietary choice
		System.out.println("Vegetarian or meat (V/M)?");
		dietaryChoice = sc.nextLine();
		
		// vegetarian picked
		if (dietaryChoice.equals("V"))  {
			
			// give user 2 vegetarian options
			System.out.println("Healthy lifestyle!");
			System.out.println("Tofu or Beans (T/B)?");
			vegetarianOption = sc.nextLine();
			
			// this is a nested if-else statement
			if (vegetarianOption.equals("T"))  {
				
				System.out.println("Tofu will be served!");
			}
			
			else  {
				
				System.out.println("Beans will be served!");
			}
		
		}
	
		// meat picked
		else  {					

			// give user 2 meat options
			System.out.println("Not so healthy lifestyle!");
			System.out.println("Beef or Chicken (B/C)?");
			meatOption = sc.nextLine();
			
			// this is a nested if/else statement
			if (meatOption.equals("B")) {
				
				System.out.println("Big mac will be served!");
			}
			
			else  {
				
				System.out.println("McChicken will be served!");
			}
		}
			
	}
}
