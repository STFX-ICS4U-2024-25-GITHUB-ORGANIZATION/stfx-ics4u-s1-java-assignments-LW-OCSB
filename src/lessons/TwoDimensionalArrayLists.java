package lessons;

import java.util.ArrayList;

public class TwoDimensionalArrayLists {

	public static void main(String[] args) {

		// rows
		ArrayList<String> row1 = new ArrayList();
		ArrayList<String> row2 = new ArrayList();
		ArrayList<String> row3 = new ArrayList();
		ArrayList<String> row4 = new ArrayList();
		
		// ArrayList of ArrayLists
		ArrayList<ArrayList<String>> myList = new ArrayList();
		
		// Data-fill rows 
		
		// first car
		row1.add("2008");
		row1.add("Honda");
		row1.add("Prelude");
		row1.add("Gold");
		row1.add("1000");
		
		// second car
		row2.add("2006");
		row2.add("Chrysler");
		row2.add("Caravan");
		row2.add("Blue");
		row2.add("44198");
		
		// third car
		row3.add("2007");
		row3.add("Ford");
		row3.add("Explorer");
		row3.add("Red");
		row3.add("22550");
		
		// fourth car
		row4.add("2000");
		row4.add("GM");
		row4.add("Oldsmobile");
		row4.add("Silver");
		row4.add("62852");
		
		// add cars to ArrayList
		myList.add(row1);
		myList.add(row2);
		myList.add(row3);
		myList.add(row4);
		
		// print cars
		for (int i=0; i<myList.size(); i++)  {
			
			for (int j=0; j<row1.size(); j++) {
				
				System.out.println(myList.get(i).get(j) + " ");
			}
			
			System.out.println("\n");
		}
		
		// TASK:  Modify code to add fifth car
	}
}
