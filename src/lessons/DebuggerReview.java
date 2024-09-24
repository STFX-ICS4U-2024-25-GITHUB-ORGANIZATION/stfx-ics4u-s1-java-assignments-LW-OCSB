package lessons;
import java.util.Scanner;

public class DebuggerReview {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		// input
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		
		// processing
		sum = num1 + num2;
		
		// output
		System.out.println("SUM: " + sum);
	}

}
