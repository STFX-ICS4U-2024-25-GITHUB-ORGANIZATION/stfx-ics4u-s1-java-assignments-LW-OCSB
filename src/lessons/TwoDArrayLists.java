package lessons;
import java.util.ArrayList;

public class TwoDArrayLists {

	public static void main(String[] args) {

		// ArrayLists used for cars/rows
		ArrayList<String> row1 = new ArrayList();
		ArrayList<String> row2 = new ArrayList();
		ArrayList<String> row3 = new ArrayList();
		ArrayList<String> row4 = new ArrayList();
		
		// ArrayList of ArrayLists
		ArrayList<ArrayList<String>> myList = new ArrayList();
		
		// Create car/row 1
		row1.add("2000");
		row1.add("Volkswagen");
		row1.add("Beetle");
		row1.add("Blue");
		row1.add("243,000km");
		
		// Create car/row 2
		row2.add("2020");
		row2.add("Hyundai");
		row2.add("Elantra");
		row2.add("Black");
		row2.add("120,000km");
		
		// Create car/row 3
		row3.add("2010");
		row3.add("Toyota");
		row3.add("Corolla");
		row3.add("Silver");
		row3.add("180,000km");
		
		// Create car/row 4
		row4.add("2016");
		row4.add("Honda");
		row4.add("Accord");
		row4.add("Dark Blue");
		row4.add("134,000km");
		
		// Add cars/rows to 2D ArrayList
		myList.add(row1);
		myList.add(row2);
		myList.add(row3);
		myList.add(row4);
		
		// print the inventory
		for (int i=0; i<myList.size(); i++)  {
			
			for (int j=0; j<row1.size(); j++)  {
				
				System.out.print(myList.get(i).get(j) + " "); 
			}
			
			System.out.print("\n");
		}

	}
}
