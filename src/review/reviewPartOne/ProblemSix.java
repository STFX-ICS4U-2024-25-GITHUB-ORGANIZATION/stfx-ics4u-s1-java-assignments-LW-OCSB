package review.reviewPartOne;
import java.util.Scanner;


public class ProblemSix {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		// prompt user
		System.out.println("Enter number: ");
		number = sc.nextInt();
		
		for (int i = 0; i < 11; i++)  {
			
			System.out.println( i *  number );
			
		}
		

	}

}
