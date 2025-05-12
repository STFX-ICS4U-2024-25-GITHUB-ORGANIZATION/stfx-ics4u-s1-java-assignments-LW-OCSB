package lessons;

public class InsertionSort {

	public static void main(String[] args) {

		int[] myArray = {4, 1, 3, 8, 2, 5, 6, 9, 7, 0};
		
		insertionSort(myArray);

	}

	// DESCRIPTION - Sorts int[] in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void
	public static void insertionSort(int[] a)  {
		
		// outer loop
		for(int i=1; i<a.length; i++)  {
		
			// inner loop
			for(int j=i; j>0; j--)  {
				
				if(a[j] < a[j-1])  {
					
					swap(a, j, j-1);
				}
				
				else
					break;
			}
		}
	}
	
	
	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	
	
	
}
