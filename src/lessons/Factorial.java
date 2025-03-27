package lessons;

public class Factorial {

	public static void main(String[] args) {

		// Factorial Review
		// System.out.println(factorial(4));
		
		// Recursive factorial
		System.out.println(factorialRecursive(4));
		
	}
	
	
	// DESCRIPTION - Returns a! for a>=0.  Sentinel -1.
	// PARAMETERS - int a
	// RETURN - int
	public static int factorialRecursive(int a)  {
	
		// error case
		if (a<0)
			return -1;
		
		// base cases (a.k.a. "stop" case)
		else if ((a==0)||(a==1))
			return 1;

		else
			return a * factorialRecursive(a-1);
	}
	
	
	
	
	// DESCRIPTION - Returns a! for a>=0.  Sentinel -1.
	// PARAMETERS - int a
	// RETURN - int
	public static int factorial(int a)  {
		
		int answer = 1;
		
		// error case
		if (a<0)
			return -1;
		
		// base cases
		else if ((a==0)||(a==1))
			return answer;
		
		else {
		
			for (int i=a; i>0; i--)	
				answer = answer * i;
			
			return answer;
		}
	}
}
