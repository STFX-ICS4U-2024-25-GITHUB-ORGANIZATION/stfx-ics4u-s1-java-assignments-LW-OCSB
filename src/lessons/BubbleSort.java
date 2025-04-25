package lessons;

import myMethods.MyMethods;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {8, 6, 1, 5, 7, 0, 9, 3, 4, 2};
		
		// before sort
		for(int i=0; i<myArray.length - 1; i++)  {
			
			System.out.print(myArray[i] + " ");
		}

		bubbleSort(myArray);
		
		// after sort
		for(int i=0; i<myArray.length - 1; i++)  {
			
			System.out.print(myArray[i] + " ");
		}
		
	}

	
	// DESCRIPTION - Sorts int[] in ascending order.
	// PARAMETERS - int[]
	// RETURN - void
	public static void bubbleSort(int[] a)  {
		
		
	}
	
}
