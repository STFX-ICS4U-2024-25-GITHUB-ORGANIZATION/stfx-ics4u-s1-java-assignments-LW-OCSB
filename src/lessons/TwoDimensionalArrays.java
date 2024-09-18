package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		// Two Dimensional Arrays are arrays containing arrays
		// Think like a spreadsheet: rows and columns
		// First identifier is the rows, second is the columns
		
		// Syntax:  datatype[][] arrayIdentifier = new datatype[rowSize][columnSize];
		
		// Examples:
		int[][] myInt2DArray = new int[4][3];
		
		// populate 2-d Array with data
		myInt2DArray[0][0] = 27;
		myInt2DArray[0][1] = 300;
		myInt2DArray[0][2] = 5;
		myInt2DArray[1][0] = 133;
		myInt2DArray[1][1] = 24;
		myInt2DArray[1][2] = 13;
		myInt2DArray[2][0] = 7;
		myInt2DArray[2][1] = 14;
		myInt2DArray[2][2] = 32;
		myInt2DArray[3][0] = 1;
		myInt2DArray[3][1] = 2;
		myInt2DArray[3][2] = 3;
		
		// command to show number of rows:  arrayIdentifier.length
		System.out.println("Rows = " + myInt2DArray.length);
		
		// command to show number of columns:  arrayIdentifier[0].length
		System.out.println("Columns = " + myInt2DArray[0].length);
		
		// loop through rows
		for (int i=0; i<myInt2DArray.length; i++)  {
			
			System.out.println("Row " + i + " : ");
			
			for (int j=0; j<myInt2DArray[0].length; j++)  {
				
				System.out.println(myInt2DArray[i][j]);
			}
			
			
		}
		
		
		

	}

}
