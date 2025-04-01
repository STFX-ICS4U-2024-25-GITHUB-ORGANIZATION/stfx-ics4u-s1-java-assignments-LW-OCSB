package lessons;
import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {

		// variables
		ArrayList<String> myArrayList = new ArrayList();
		
		// add elements to ArrayList
		myArrayList.add("foo");
		myArrayList.add("bar");
		myArrayList.add("fubar");

		// create Array using size of ArrayList
		String[] myArray = new String[myArrayList.size()];
		
		// copy contents of ArrayList to Array
		myArrayList.toArray(myArray);
		
		// print array TO TEST
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
		}
	}

}
