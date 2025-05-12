package lessons;

public class InsertionSort {

	public static void main(String[] args) {

		int[] myArray = {4, 1, 3, 8, 2, 5, 6, 9, 7, 0};
		
		// print 1 to 0
		for(int i=1; i<myArray.length; i++)  {
			
			System.out.print(myArray[i] + " ");
		}
		
		insertionSort(myArray);

	}

	// DESCRIPTION - Sorts int[] in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void
	public static void insertionSort(int[] a)  {
		
		
		
	}
	
	
	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	
	
	
}
