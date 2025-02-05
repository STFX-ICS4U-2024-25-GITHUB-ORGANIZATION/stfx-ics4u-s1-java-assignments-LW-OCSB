package ics3uLessons;

public class MathOperations {

	public static void main(String[] args) {

		// variables
		int myInteger1 = 13;
		int myInteger2 = 7;
		int sum = 0;
		int product = 0;
		int difference = 0;  // integer divided by integer results in truncated integer
		int quotient = 0;
		int modulus = 0;
		
		// processing
		sum = myInteger1 + myInteger2;
		product = myInteger1 * myInteger2;
		difference = myInteger1 - myInteger2;
		quotient = myInteger1 / myInteger2;
		modulus = myInteger1 % myInteger2;
		
		// output
		System.out.println("Integer1: " + myInteger1);
		System.out.println("Integer2: " + myInteger2);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Difference: " + difference);
		System.out.println("Quotient: " + quotient);
		System.out.println("Modulus: " + modulus);
		
		System.out.println(13/7.0);  // division by any double will result in double answer
	}

}
