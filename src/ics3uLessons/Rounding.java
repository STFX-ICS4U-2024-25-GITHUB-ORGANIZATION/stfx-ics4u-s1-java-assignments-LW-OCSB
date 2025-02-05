package ics3uLessons;

public class Rounding {

	public static void main(String[] args) {
		
		double price = 13.738;
		
		price = price * 100;
		
		price = Math.round(price);  // rounds to nearest integer
		
		price = price / 100;
		
		System.out.println(price);
	}

}
