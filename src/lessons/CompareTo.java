package lessons;

public class CompareTo {

	public static void main(String[] args) {

	
		/*
		 ASCII REPRESENTATIONS:
		 a = 97
		 b = 98
		
		 FORMULA: calling object - argument = answer 
		 EXAMPLE: "a".compareTo("b") = -1
		 		  97 - 98 = -1
		 
		*/
		
		System.out.println("a".compareTo("b"));		// -1
		System.out.println("a".compareTo("a"));		// 0
		System.out.println("b".compareTo("a"));		// 1
		System.out.println("a".compareTo("c"));		
		System.out.println("c".compareTo("a"));
		System.out.println( "b".compareTo("b"));
		System.out.println( "a".compareTo("d"));
		System.out.println( "d".compareTo("a"));
		System.out.println( "e".compareTo("e"));

		// To handle case sensitivity:
		System.out.println( "a".compareToIgnoreCase("A"));

		// Comparing Strings with different length
		// Compares left-to-right and calculates answer based
		// on first mis-match
		System.out.println("xax".compareTo("xbx"));
		System.out.println("xxbsafadsfadsfasdf".compareTo("xxa"));
		System.out.println( "xxb".compareTo("xxa"));
		System.out.println( "ab c".compareTo("abc"));
		
		// If no mis-matcc, method returns relative size difference
		System.out.println("a".compareTo("aa"));
		System.out.println("a".compareTo("ab"));
		System.out.println("a".compareTo("abc"));
	}

}
