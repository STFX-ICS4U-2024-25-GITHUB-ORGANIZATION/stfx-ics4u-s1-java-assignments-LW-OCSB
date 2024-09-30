package lessons;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		// ArrayLists are classes used to store lists of Objects
		// Can't store primitives
		
		// SYNTAX (various ways to create):
		
		// ArrayList<Object-type> varName = new ArrayList();
		ArrayList<String> myStringArrayList = new ArrayList();

		// ArrayList<Object-type> varName = new ArrayList<>();
		ArrayList<Integer> myIntegerArrayList = new ArrayList<>();
		
		// ArrayList<Object-type> varName = new ArrayList<Object-type>();
		ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
		
		// ArrayList<Object-type> varName = new ArrayList<Object-type>(<size>);
		ArrayList<Boolean> myBooleanArrayList = new ArrayList<Boolean>(50);
		
		
		// ArrayList Methods:
		myIntegerArrayList.add(13);			// appends object to end of ArrayList
		myIntegerArrayList.add(17);
		myIntegerArrayList.add(33);
		myIntegerArrayList.add(1, 66);    // inserts object at index, shifts everything right
		myIntegerArrayList.add(17);
		myIntegerArrayList.remove(0);     // removes object at index
		
		int myInt = myIntegerArrayList.get(0);  // returns object from index
		
		System.out.println(myIntegerArrayList.indexOf(17));  // displays value at index
		
		System.out.println(myInt);

		System.out.println(myIntegerArrayList.size());  // returns number of elements in list

		System.out.println(myIntegerArrayList.toString());
		
		myIntegerArrayList.set(0,  55);
		
		System.out.println(myIntegerArrayList.toString());
		
		
		
		
		
	}

}
