package lessons;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {


		// create ArrayList, add elements to it
		ArrayList<String> myArrayList = new ArrayList();
		myArrayList.add("dog");
		myArrayList.add("cat");
		myArrayList.add("mouse");
		
		// create array to hold ArrayList elements
		String[] myArray = new String[myArrayList.size()];
		
		// copy all elements from ArrayList to Array
		myArrayList.toArray(myArray);

		// print Array to check
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
		}
		
		
	}

}
