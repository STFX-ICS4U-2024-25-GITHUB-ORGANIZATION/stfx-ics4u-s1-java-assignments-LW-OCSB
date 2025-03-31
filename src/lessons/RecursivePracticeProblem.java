package lessons;

public class RecursivePracticeProblem {

	public static void main(String[] args) {

		countUp(6, 4);
	}

	
	// DESCRIPTION - Method counts up from x to y.  Where x <= y.
	// PARAMETERS - int x, int y
	// RETURN TYPE - void
	public static void countUp(int x, int y)  {

		// error case
		if (x > y)
			System.out.println("-1");
		
		// base case / stop case
		else if (x == y)
			System.out.println(x);
		
		// action / recursive call
		else  {
			
			System.out.println(x);
			countUp(x+1, y);
		}
		
		
		
	}
	
}
