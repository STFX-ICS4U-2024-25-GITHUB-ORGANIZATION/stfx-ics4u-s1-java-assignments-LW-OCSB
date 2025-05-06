package lessons;

public class SelectionSort {

	public static void main(String[] args) {

		int[] myArray = {3, 4, 7, 0, 8, 5, 2, 9, 6, 1};
		
		selectionSortRecursive(myArray, 0);
		
		for (int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " ");
	}
	

	public static void selectionSortRecursive(int[] a, int i)  {
		
		// error case
		if (i < 0)
			return;
		
		// base case / stop case
		if(i == a.length-1)
			return;
		
		// do one pass
		for (int j=i; j<a.length-1; j++)  {
			
			if (a[i] > a[j+1])
				swap(a, i, j+1);
		}
		
		// do it again, starting from next element
		selectionSortRecursive(a, i+1);
	}
	
	public static void selectionSort(int[] a)  {

		// outer for-loop
		for (int i=0; i<a.length-1 ; i++)  {
			
			// inner for-loop
			for (int j=i; j<a.length-1; j++)  {
				
				if (a[i] > a[j+1])
					swap(a, i, j+1);
			}
		}
		
	}
	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	

}
