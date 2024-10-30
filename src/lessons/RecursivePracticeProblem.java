package lessons;

public class RecursivePracticeProblem {

	public static void main(String[] args) {

		countUp(1, 5);	// OUTPUT:  1 2 3 4
	}

	// DESCRIPTION - Method counts up from x to y.
	// PARAMETERS - int x, int y
	// RETURN TYPE - void
	public static void countUp(int x, int y)  {

		// error case
		if (x > y)  {
			
			System.out.println("x must be less than y.");
		}
		
		// base case (stop case)
		else if (x == y)  {
			
			System.out.println(x);
		}
		
		// task / recursive call
		else  {
			
			System.out.println(x);
			countUp(x+1, y);
		}
	
	}
}
