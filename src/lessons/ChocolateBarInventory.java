package lessons;

import myMethods.MYMETHODS;

public class ChocolateBarInventory {
	
	public static void main(String[] args) {

		// variables
		int rows = 4;
		int columns = 2;
		double[][] myChocolateBars = new double[rows][columns];
		final double TAX = 0.13;
		double retailValue = 0.0;
		double valueWithTax = 0.0;
		int totalChocolateBars = 0;
		
		// Populate Mars Bars
		myChocolateBars[0][0] = 5;		// inventory
		myChocolateBars[0][1] = 1.75;	// price
		
		// Populate Kit Kat
		myChocolateBars[1][0] = 20;		// inventory
		myChocolateBars[1][1] = 2.00;	// price
		
		// Populate O Henry
		myChocolateBars[2][0] = 10;		// inventory
		myChocolateBars[2][1] = 2.25;	// price
		
		// Populate Snickers
		myChocolateBars[3][0] = 7;		// inventory
		myChocolateBars[3][1] = 2.50;	// price
		
		
		// Total Number of chocolate bars
		for (int i=0; i<myChocolateBars.length; i++)  {
		
			totalChocolateBars = (int) (totalChocolateBars + myChocolateBars[i][0]);
		}
		
		System.out.println("Total Number Chocolate Bars: " + totalChocolateBars);
		
		
		// Total Value of Chocolate Bars
		for (int i=0; i<myChocolateBars.length; i++)  {
			
			retailValue = retailValue + (myChocolateBars[i][0] *  myChocolateBars[i][1]);
		}
		
		System.out.println("Total Retail Value: $" + retailValue);
		
		// Total Value of Chocolate Bars with Tax
		valueWithTax = retailValue + (retailValue * TAX);
		
		System.out.println("Total Retail Value with Tax: $" + 
			MYMETHODS.roundDouble(valueWithTax, 2));
		
	}

}
