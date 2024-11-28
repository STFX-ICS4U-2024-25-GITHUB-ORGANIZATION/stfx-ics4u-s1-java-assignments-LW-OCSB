package lessons;

public class InsertionSort {

	public static void main(String[] args) {

		int[] myArray = {6, 3, 8, 2, 9, 0, 7, 5, 4};
		insertionSort(myArray);
		
		for (int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " ");
			
	}
	
	// DESCRIPTION - Sorts int[] in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void
	public static void insertionSort(int[] a)  {
		
		for (int i=1; i<a.length; i++)
			
			for (int j=i; j>0; j--)  {
				
				if (a[j] < a[j-1])   {
					swap(a, j, j-1);
				}
				
				else
					break;
			}
		
	}
	
	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
}
