package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		// array of arrays
		// think of it like a spreadsheet, rows and columns
		// first identifier is rows, second identifier is columns
		
		// SYNTAX:
		// datatype[][] arrayIdentifier = new datatype[rowSize][columnSize];
		
		// EXAMPLES:
		String[][] myStringArray = new String[2][2];
		int[][] myIntArray = new int[3][3];
		double[][] myDoubleArray = new double[2][6];
		
		// data assignment
		myIntArray[0][0] = 7;
		myIntArray[0][1] = 4;
		myIntArray[0][2] = 9;
		myIntArray[1][0] = 0;
		myIntArray[1][1] = 8;
		myIntArray[1][2] = 10;
		myIntArray[2][0] = 13;
		myIntArray[2][1] = 42;
		myIntArray[2][2] = 63;
		
		// access data
		System.out.println(myIntArray[1][2]);
		
		// display number of rows
		System.out.println("ROWS: " + myIntArray.length);
		
		// display number of columns
		System.out.println("COLUMNS: " + myIntArray[0].length);
		
		
		
		// iterate through all the numbers
		for (int i=0; i<myIntArray.length; i++)  {
			
			for (int j=0; j<myIntArray[0].length; j++)  {
				
				System.out.println(myIntArray[i][j]);
				
			}
		}
		
		
	}

}
