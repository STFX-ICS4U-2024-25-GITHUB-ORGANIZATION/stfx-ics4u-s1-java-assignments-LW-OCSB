package lessons;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {6, 3, 8, 2, 9, 0};
		bubbleSort(myArray);
		
		for (int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " ");
			
	}
	
	// DESCRIPTION - Sorts int[] in ascending order
	// PARAMETERS - int[]
	// RETURN - void
	public static void bubbleSort(int[] a)  {
		
		boolean swapped = true;

		while (swapped == true)  {
		
			swapped = false;
			
			for (int i=0; i<a.length - 1; i++)  {
				
				if (a[i] > a[i+1])  {
					swap(a, i, i+1);
					swapped = true;
				}
			}
		}
	}
	
	
	// DESCRIPTION - Swaps elements in an array at index x with index y
	// PARAMETERS - int[] a, int x, int y
	// RETURN - void
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
