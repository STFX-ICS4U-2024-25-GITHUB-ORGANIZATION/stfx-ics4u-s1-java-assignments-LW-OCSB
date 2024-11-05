package lessons;

public class UnsortedLinearSearch {

	// GLOBAL VARIABLE (AVOID USING GLOBAL VARIABLES)
	static int numSearches = 0;
	
	public static void main(String[] args) {

		// unsorted array of colours (not alphabetical)
		String[] unSortedArray = {"peach", "blue", "salmon", "brown", 
				"green", "orange", "purple", "red", "black", "white"};
		
		
		System.out.println(unsortedLinearSearch(unSortedArray, "white"));
		System.out.println("Number of elements searched: " + numSearches);
		numSearches = 0;
		
		System.out.println(unsortedLinearSearch(unSortedArray, "peach"));
		System.out.println("Number of elements searched: " + numSearches);
		numSearches = 0;
		
		System.out.println(unsortedLinearSearch(unSortedArray, "red"));
		System.out.println("Number of elements searched: " + numSearches);
		numSearches = 0;
		
		System.out.println(unsortedLinearSearch(unSortedArray, "pink"));
		System.out.println("Number of elements searched: " + numSearches);
		numSearches = 0;
	}

	// DESCRIPTION - Returns true if search pattern found inside array.
	// PARAMETERS - String[] a, String p
	// RETURN TYPE - boolean
	public static boolean unsortedLinearSearch(String[] a, String p)  {
		
		// loop through array to check for exact match
		for(int i=0; i<a.length; i++)  {
			
			// increment counter for this lesson
			numSearches++;
			
			if(a[i].equals(p))
				return true;
		}
		
		return false;
	}
	
	
	
	
	
}
