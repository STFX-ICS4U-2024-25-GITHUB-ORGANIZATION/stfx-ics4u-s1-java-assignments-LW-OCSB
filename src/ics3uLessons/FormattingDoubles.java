package ics3uLessons;

public class FormattingDoubles {

	public static void main(String[] args) {
		
		// variables
		double myDouble = 13.7456738;
		String formattedDouble = "";
		
		// processing
		formattedDouble = String.format("%.2f", myDouble);
		
		// output
		System.out.println(formattedDouble);
	}

}
