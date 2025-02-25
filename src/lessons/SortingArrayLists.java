package lessons;
import java.util.ArrayList;   // for ArrayLists
import java.util.Comparator;  // for sorting ArrayLists

public class SortingArrayLists {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList();
		
		students.add("Steve");
		students.add("Abel");
		students.add("Owen");
		
		// sort alphabetically/numerically ascending
		students.sort(Comparator.naturalOrder());
		
		// sort alphabetically/numerically descending
		students.sort(Comparator.reverseOrder());
		
		for(int i=0; i<students.size(); i++)
			System.out.println(students.get(i));
	}

}
