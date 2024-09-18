package lessons;

public class ChocolateBarInventory {

	public static void main(String[] args) {

		// variables
		double retailValue = 0.0;
		double valueWithTax = 0.0;
		final double TAX_RATE = 0.13;
		int rows = 4;
		int cols = 2;
		int numBars = 0;
		double[][] myInventory = new double[rows][cols];
		
		// Mars Bars
		myInventory[0][0] = 337;
		myInventory[0][1] = 3.26;
		
		// Kit Kat
		myInventory[1][0] = 400;
		myInventory[1][1] = 2.50;
		
		// O Henry
		myInventory[2][0] = 201;
		myInventory[2][1] = 3.65;
		
		// Snickers
		myInventory[3][0] = 556;
		myInventory[3][1] = 1.00;

		// number of bars
		for (int i=0; i<rows; i++)  {

			numBars = (int)( numBars + myInventory[i][0] );
		}
		
		// retailValue (total value of bars without tax)
		for (int i=0; i<rows; i++)  {
		
			retailValue = retailValue + (myInventory[i][0] * myInventory[i][1]);
		}
		
		// value with tax
		valueWithTax = retailValue + (retailValue * TAX_RATE);
		
		
		// output
		System.out.println("Total bars: " + numBars);
		System.out.println("Total retail value: $" + retailValue);
		System.out.println("Total retail value with tax: $" + valueWithTax);
		
		
	}

}
