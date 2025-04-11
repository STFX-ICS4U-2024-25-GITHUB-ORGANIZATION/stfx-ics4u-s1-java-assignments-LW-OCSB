package lessons;

public class SortedLinearSearch {

	public static void main(String[] args) {

		String[] sortedArray = {"black", "blue", "green", "orange", "peach",
								"purple", "red", "salmon", "white"};

		System.out.println(sortedLinearSearch(sortedArray, "black"));
	}
	
	
	// DESCRIPTION - Returns index of the search pattern in array.  -1 if not found.
	// PARAMETERS - String[] a, String p
	// RETURN - int
	public static int sortedLinearSearch(String[] array, String pattern)  {
		
		// loop through the entire array
		for (int i=0; i<array.length; i++)  {
			
			// return index if exact match found
			if (array[i].compareTo(pattern) == 0)
				return i;
			
			// past the point where pattern should be in a sorted list, stop 
			if (array[i].compareTo(pattern) > 0)
				return -1;
		}
		
		// entire list searched, pattern not found
		return -1;
	}

}
