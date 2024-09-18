package lessons;

public class JavaArrays {

	public static void main(String[] args) {
		
		// single identifier with indexes starting at 0
		// holds elements of any single type (primitives or objects)
		// not dynamic, can't grow after creation

		// Syntax:	dataType[] arrayIdentifier = new dataType[size];
		
		// Examples
		String[] myStringArray = new String[69];   // size initialized
		int[] myIntArray;   // size not initialized
		double[] myDoubleArray = {13.5, 45.4, 22.1};  // values and size initialized
		
		// Accessing arrays: 0 to size-1.  Make use of "length" method
		
		System.out.println("Length of myStringArray: " + myStringArray.length);
		//System.out.println("Length of myIntArray: " + myIntArray.length);
		System.out.println("Length of myDoubleArray: " + myDoubleArray.length);
		
		// loop through elements of array
		for (int i=0; i<myDoubleArray.length; i++)  {
			
			System.out.println("Element " + i + " = " + myDoubleArray[i]);
		}
		
		System.out.println("Element 3 = " + myDoubleArray[3]);
		
		
	}

}
