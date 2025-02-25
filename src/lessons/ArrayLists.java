package lessons;
import java.util.ArrayList;		// need to import

public class ArrayLists {

	public static void main(String[] args) {

		// used to store a list of Objects of the same type
		// can't store primitive data types
		// index 0 to n-1 (like arrays)
		// dynamic (grows and shrinks)
		// includes predefined methods
		
		// Creating ArrayLists
		// SYNTAX: ArrayList<Object-type> varName = new ArrayList();
		
		// EXAMPLE
		ArrayList<String> myArrayList = new ArrayList();
		
		// add Strings to ArrayList
		String myString = "December 22, 2032";
		myArrayList.add("2024 YR4");
		myArrayList.add(myString);
		myArrayList.add("0.3% chance");

		// access elements inside ArrayList
		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList.get(2));
		
		// display size of ArrayList
		System.out.println(myArrayList.size());
		
		// insert new element at specified index
		myArrayList.add(1, "Kaboom!");
		
		// delete element in ArrayList
		myArrayList.remove(3);
		
		// find location of an matching element, returns index if found, else -1
		System.out.println(myArrayList.indexOf("bam!"));
		
		// replace an element with something else
		myArrayList.set(1, "fubar");
		
		// access all elements in ArrayList using forLoop
		for(int i=0; i<myArrayList.size(); i++)
			System.out.println(myArrayList.get(i));
		
		// return String representation of ArrayList
		System.out.println(myArrayList.toString());
		
	}

}
