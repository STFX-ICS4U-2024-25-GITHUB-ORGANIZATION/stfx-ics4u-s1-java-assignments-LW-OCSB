package lessons;

import myMethods.MyMethods;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {8, 6, 1, 5, 7, 0, 9, 3, 4, 2};
		
		// before sort
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.print(myArray[i] + " ");
		}

		bubbleSort(myArray);
		
		System.out.println("\n");
		
		// after sort
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.print(myArray[i] + " ");
		}
		
	}

	
	// DESCRIPTION - Sorts int[] in ascending order.
	// PARAMETERS - int[]
	// RETURN - void
	public static void bubbleSort(int[] a)  {
		
		boolean swap = true;
		
		while(swap == true)  {
			
			swap = false;
			
			for(int i=0; i<a.length - 1; i++)  {
				
				if (a[i] > a[i+1])  {
					
					MyMethods.swap(a, i, i+1);
					swap = true;
				}

			}
			
		}
		
		
		
		
	}
	
}
