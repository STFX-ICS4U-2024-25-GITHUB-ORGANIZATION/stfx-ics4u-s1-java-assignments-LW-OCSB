package lessons;

public class Factorial {

	public static void main(String[] args) {

	
		
		System.out.println(factorialRecursive(5));
	}

	
	// DESCRIPTION - Returns n! for any postive int.
	//			     Returns -1 for negative values
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int factorialRecursive(int n)  {
		
		// error case
		if (n < 0)
			return -1;
		
		// base case (a.k.a. stop case)
		else if (n == 0)
			return 1;
		
		return n * factorialRecursive(n-1);
	}
	
	
	// DESCRIPTION - Returns n! for any postive int.
	//			     Returns -1 for negative values
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int factorial(int n)  {
		
		// variable
		int answer = 1;
		
		// error case
		if (n < 0)
			return -1;
		
		// base case (a.k.a. stop case)
		else if (n == 0)
			return answer;
		
		for(int i=n; i>0; i--)  {
			
			answer = answer * i;
		}
		
		return answer;
	}
	
	
}
