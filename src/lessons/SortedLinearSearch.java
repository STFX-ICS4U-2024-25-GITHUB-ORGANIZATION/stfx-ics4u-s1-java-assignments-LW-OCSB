package lessons;

public class SortedLinearSearch {

	// just for lesson
	static int COUNT = 0;
	
	public static void main(String[] args) {

		String[] sortedArray = {"black", "blue", "brown", 
				"green", "orange", "peach", "purple", 
				"red", "salmon", "white"};
		
		System.out.println(sortedLinearSearch(sortedArray, "quartz"));
		System.out.println(COUNT);
	}
	
	// DESCRIPTION - Returns true if search pattern found at least
	//				 once in array.
	// PARAMETERS - String[] a, String s
	// RETURN TYPE - boolean
	public static boolean sortedLinearSearch(String[] a, String s)  {
		
		// loop through entire array
		for (int i=0; i<a.length; i++)  {
			
			COUNT++;
			
			// match found
			if (a[i].compareTo(s) == 0)
				return true;
			
			// stop if you don't have to search anymore
			if(a[i].compareTo(s) > 0)  
				return false;
		}
		
		return false;
		
	}

}
