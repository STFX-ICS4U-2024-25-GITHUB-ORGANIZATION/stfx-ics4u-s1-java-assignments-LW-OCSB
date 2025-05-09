package lessons;

public class BinarySearch {

	public static void main(String[] args) {

		String[] sortedArray = {"black", "blue", "brown", "green", "orange", "peach", "purple",
				"red", "salmon", "white"};

		
		System.out.println(binarySearch(sortedArray, "maroon"));
		
		
	}

	
	// DESCRIPTION - Returns true if pattern found in array.
	// PARAMETERS - String[] a, String p
	// RETURN TYPE - boolean
	public static boolean binarySearch(String[] a, String p)  {
		
		// variables
		int left = 0;
		int right = a.length - 1;
		int middle = (left + right) / 2;
		
		
		while (left <= right)  {
			
			// match found, stop
			if (p.compareTo(a[middle]) == 0)
				return true;
			
			// match not found, but might be on LEFT side
			else if (p.compareTo(a[middle]) < 0) {
				
				left = left;	// this line is not necessary
				right = middle - 1;
				middle = (left + right) / 2;
			}
				
			// match not found, but might be on RIGHT side: (p.compareTo(a[middle]) > 0) 
			else {  		 
				
				left = middle + 1;	
				right = right;	// this line is not necessary
				middle = (left + right) / 2;
			}
		}
		
		return false;
	}
	
}


