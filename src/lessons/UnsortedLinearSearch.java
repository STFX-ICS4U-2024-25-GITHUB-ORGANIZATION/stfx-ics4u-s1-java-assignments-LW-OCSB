package lessons;

public class UnsortedLinearSearch {

	public static void main(String[] args) {


	}

	// DESCRIPTION - Returns true if search pattern is found at least once inside array.
	// PARAMETERS - String[] array, String pattern
	// RETURN TYPE - boolean
	public static boolean unSortedLinearSearch(String[] array, String pattern)  {
		
		for(int i=0; i < array.length; i++)  {
			
			if (array[i].equals(pattern))
				return true;
		}
		
		return false;
	}

}
