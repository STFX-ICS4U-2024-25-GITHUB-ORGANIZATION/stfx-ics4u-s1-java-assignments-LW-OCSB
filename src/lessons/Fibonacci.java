package lessons;

public class Fibonacci {

	public static void main(String[] args) {


		System.out.println(fibonacci(5));
		

	}

	
	// DESCRIPTION - Returns value of Fibonacci sequence number.
	//				 Returns -1 for negative values.
	// PARAMETERS - int s
	// RETURN TYPE - int
	public static int fibonacci(int s)  {
		
		// variables
		int first = 0;
		int second = 1;
		int next = 0;
		
		// error case
		if (s < 0)
			return -1;
		
		// base case
		else if (s == 1)
			return first;
		
		// next base case
		else if (s == 2)
			return second;
		
		for (int i=2; i<s; i++)  {
			
			next = first + second;
			first = second;
			second = next;
		}
		
		
		return next;
		
	}
	
	
	
	
}	
