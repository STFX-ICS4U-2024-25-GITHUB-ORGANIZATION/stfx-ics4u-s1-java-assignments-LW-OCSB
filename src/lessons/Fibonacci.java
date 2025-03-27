package lessons;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));
		

	}
	
	// DESCRIPTION - Returns Fibonacci number for term a, for a>0.  Sentinel -1.
	// PARAMETERS - int n
	// RETURN - int
	public static int fibonacci(int n)  {
		
		// variables
		int first = 0;
		int second = 1;
		int next = 0;
		
		// error case
		if (n<1)
			return -1;
		
		// base case 1
		if (n==1)
			return first;
		
		// base case 2
		else if (n==2)
			return second;
		
		else {
			
			for(int i=0; i<n-2; i++)  {
				
				next = first + second;
				first = second;
				second = next;
			}
			
			return next;
		}
		
	}

}
