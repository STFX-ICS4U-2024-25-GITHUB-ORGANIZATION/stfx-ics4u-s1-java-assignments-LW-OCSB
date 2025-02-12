package assignments;
import java.util.Scanner;

public class U2A1_1DArraysSolution {

	public static void main(String[] args) {

		// variables
		int choice = 0;
		int[] myArray = new int[12];
		
		while (choice != 5)  {
			
			choice = displayMenu();
			
			if (choice == 1)
				enterTwelveIntegers(myArray);
				
			else if (choice == 2)
				listAllIntegersAndSum(myArray);
			
			else if (choice == 3)
				listEvenIntegersAndSum(myArray);
			
			else if (choice == 4)
				listOddIntegersAndSum(myArray);
			
			else
				return;
			
		}
		
		System.out.println("Exiting program.");
	}
	
	
	// DESCRIPTION - Displays main menu, returns user choice
	// PARAMETERS - NA
	// RETURN TYPE - int
	public static int displayMenu()  {
		
		// variables
		int selection = 0;
		Scanner sc = new Scanner(System.in);
		
		while ((selection < 1) || (selection > 5))  {
		
			System.out.println("Menu");
			System.out.println("1. Enter 12 integers.");
			System.out.println("2. List 12 integers and sum.");
			System.out.println("3. List 12 even integers and sum.");
			System.out.println("4. List 12 odd integers and sum.");
			System.out.println("5. Exit.");
			System.out.println("Enter choice: ");
		
			try {
				String temp = sc.nextLine();
				selection = Integer.parseInt(temp);
			}
		
			catch(Exception e)  {
			
				System.out.println("Invalid.");
			}
		}
		
		return selection;
	}
	
	
	// DESCRIPTION - Prompts user to enter 12 ints, stores in array
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void enterTwelveIntegers(int[] a)  {
		
		// variables
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<a.length; i++)  {
			
			System.out.println("Enter int #" + (i+1) + ":");
			
			try  {
				a[i] = sc.nextInt();
			}
			
			catch (Exception e){
				
				System.out.println("Must enter int, start over.");

				a = new int[12];
			}
		}
	}
	
	
	// DESCRIPTION - Lists all integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listAllIntegersAndSum(int[] a)  {
		
		// variables
		int sum = 0;
		
		for(int i=0; i<a.length; i++)  {
		
			sum = sum + a[i];
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nSUM = " + sum);
	}
	
	
	// DESCRIPTION - Lists even integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listEvenIntegersAndSum(int[] a)  {
		
		// variables
		int sum = 0;
		
		for(int i=0; i<a.length; i++)  {
		
			if (a[i]%2 == 0)  {
				sum = sum + a[i];
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println("\nSUM = " + sum);
	}
	
	
	// DESCRIPTION - Lists odd integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listOddIntegersAndSum(int[] a)  {
		
		// variables
		int sum = 0;
		
		for(int i=0; i<a.length; i++)  {
		
			if (a[i]%2 != 0)  {
				sum = sum + a[i];
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println("\nSUM = " + sum);
	}
	
}
