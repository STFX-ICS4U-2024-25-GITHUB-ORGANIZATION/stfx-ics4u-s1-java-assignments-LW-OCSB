package lessons;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList();
		
		students.add("Neema");
		students.add("Avraj");
		students.add("Stuart");
		students.add("Emily");
		
		for (int i=0; i<students.size(); i++)  {
			
			System.out.println(students.get(i));
		}
		
	}

}
