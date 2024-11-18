package lessons;

public class BinarySearch {

	public static void main(String[] args) {
		
		String[] sortedArray = {"black", "blue", "brown", "green", "orange", "peach", 
				"purple", "red", "salmon", "white"};    

		System.out.println(binarySearch(sortedArray, "foo"));
		
	}
	
	// DESCRIPTION - Returns true if search pattern found in array.
	// PARAMETERS - String[] a, String s
	// RETURN TYPE - boolean
	public static boolean binarySearch(String[] a, String s)  {
		
		// variables
		int left = 0;						   // 0
		int right = a.length - 1;              // 9
		int middle = (left + right) / 2;	   // 5 
		
		while (left <= right)  {
			
			if (s.compareTo(a[middle]) == 0)
				
				return true;
			
			// word is on left side
			else if (s.compareTo(a[middle]) < 0) {
				
				// left stays the same
				right = middle - 1;
				middle = (left + right) / 2;
			}
		
			// word is on right side
			else if (s.compareTo(a[middle]) > 0) {
			
				left = middle + 1;
				// right stays the same
				middle = (left + right) / 2;
			}
			
		}
	
		// word not found
		return false;
	}

}


