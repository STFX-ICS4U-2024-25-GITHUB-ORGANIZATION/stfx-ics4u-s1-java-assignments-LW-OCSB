package lessons;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] myArray = {0, 4, 9, 8, 7, 3, 5, 1, 2, 6};
		
		System.out.print("Unsorted List:         ");
		printArray(myArray);
		partition(myArray, 0, myArray.length-1);
		System.out.print("After One Partition:   ");
		printArray(myArray);
		quickSort(myArray, 0, myArray.length-1);
		System.out.print("After Quick Sort:      ");
		printArray(myArray);
	}
	
	
    // DESCRIPTION - Sorts int[] in ascending order.
    // PARAMETERS - int[] array, int left, int right
    // RETURN - void
    public static void quickSort(int[] array, int left, int right)  {
       
    	// variables
    	int pivot = 0;
    	
    	// base/stop case (sub-array is length 1, nothing to sort)
    	if (left == right)
    		return;
    	
    	// picking pivot strategies will vary
    	pickPivot(array, left, right);
    	
    	// partition list
    	pivot = partition(array, left, right);
    
    	// pivot is left-most element, partition sub-list to the right
    	if (pivot == left)
    		quickSort(array, pivot+1, right);
    	
    	// pivot is right-most element, partition sub-list to the left
    	else if (pivot == right)
    		quickSort(array, left, pivot-1);
    	
    	// pivot inside list, partition sub-lists on both sides of pivot
    	else  {
    		
    		quickSort(array, left, pivot-1);
    		quickSort(array, pivot+1, right);
    	}
    }
   
    
    // DESCRIPTION - Right-most element to become pivot, moves pivot to correct location
    //				 in sorted list, moves all values less than pivot to left of pivot,
    //				 moves all values greater than pivot to right of pivot.  Returns
    //				 index of pivot.  a.length > 1.
    // PARAMETERS - int[] array, int left, int right
    // RETURN - int
    public static int partition(int[] array, int left, int right)  {
    	
    	// sub-array must be > 1
    	if (left == right)
    		return -1;
    	
    	int pivot = right;   	
    	int itemFromLeftIndex = getItemFromLeftIndex(array, left, right);  
    	int itemFromRightIndex = getItemFromRightIndex(array, left, right);  
    		
    	// CONDITION 1 - no itemFromLeft, pivot is right-most item, stop loop
    	if (itemFromLeftIndex == -1)
    		return pivot;
    			
    	// CONDITION 2 - no itemFromRight, swap pivot to left-most position, stop loop
    	else if (itemFromRightIndex == -1)  {
    			
    		swap(array, left, right);
    		return left;
    	}
    		
	    // CONDITION 3: Indexes cross.  Swap itemFromLeft with pivot.  Don't repeat.
	    else if (itemFromLeftIndex > itemFromRightIndex)  {
        	   
        	swap(array, itemFromLeftIndex, right);
        	return itemFromLeftIndex;
	    }
    		
    	// CONDITION 4: swap elements and repeat (itemFromLeftIndex < itemFromRightIndex)
	    else  {
	    	
	    	swap(array, itemFromLeftIndex, itemFromRightIndex);
	    	return partition(array, left, right);
    	}
    }
    
    
    // DESCRIPTION - Selects middle element to become pivot, swaps with right-most element in list.
    // PARAMETERS - int[] array, int left, int right
    // RETURN - void
    public static void pickPivot(int[] array, int left, int right)  {
        
    	int middle = (left + right) / 2;
    	swap(array, middle, right);
    }
	
    
	// DESCRIPTION - Returns index of first value bigger than pivot, starting from the left.  
    //				 Returns -1 if no element is bigger than pivot.
	// PARAMETERS - int[] array, int left, int right
	// RETURN - int
	public static int getItemFromLeftIndex(int[] array, int left, int right)  {
		
		int itemFromLeftIndex = -1;
		
		for(int i=left; i<=right; i++)  {

		    if (array[i] > array[right])  {
		        itemFromLeftIndex = i;
		        break;
		    }
		}
		
		return itemFromLeftIndex;
	}
	
	
	// DESCRIPTION - Returns index of first value smaller than pivot, starting from the right.  
    //				 Returns -1 if no element is smaller than pivot.
	// PARAMETERS - int[] array, int left, int right
	// RETURN - int
	public static int getItemFromRightIndex(int[] array, int left, int right)  {
		
		int itemFromRightIndex = -1;
		
		for(int i=right; i>=left; i--)  {
		    
		    if (array[i] < array[right])  {
		        itemFromRightIndex = i;
		        break;
		    }
		}
		
		return itemFromRightIndex;
	}
	
	   
    // DESCRIPTION - Swaps element x with element y.
    // PARAMETERS - int[] array, int x, int y
    // RETURN - void
    public static void swap(int[] a, int x, int y)  {
            
    	int temp = a[x];
    	a[x] = a[y];
    	a[y] = temp;
    }
    
    
    // DESCRIPTION - Prints array.
    // PARAMETERS - int[] array
    // RETURN - void
	public static void printArray(int[] array)  {
		
		for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
		
		System.out.println();
	}
	
}