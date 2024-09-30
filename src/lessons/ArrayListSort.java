package lessons;

import java.util.ArrayList;
import java.util.Comparator;    // for sorting

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<String> letters = new ArrayList();
		
		letters.add("B");
		letters.add("A");
		letters.add("C");
		letters.add("E");
		letters.add("D");
		System.out.println(letters);
		
		// sort ArrayList from smallest to largest (numbers),
		// or alphabetically (Strings)
		letters.sort(Comparator.naturalOrder());
		System.out.println(letters);
		
		
		letters.sort(Comparator.reverseOrder());
		System.out.println(letters);
	}

}
