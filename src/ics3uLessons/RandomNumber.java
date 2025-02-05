package ics3uLessons;

public class RandomNumber {

	public static void main(String[] args) {

		// generates double, where n is 0.0 >= n < 1.0
		//System.out.println(Math.random());

		// to generate random number, multiply by n
		int n = 3;
		//System.out.println(   Math.random() * n  );
		
		// casting to int will generate a truncated number
		// between 0 and n (inclusive)
		//System.out.println(  (int)(Math.random() * (n+1))  );
	
		// to generate number between 1 and n inclusive:
		System.out.println(  (int)(Math.random() * n) + 1 );
	}

}
