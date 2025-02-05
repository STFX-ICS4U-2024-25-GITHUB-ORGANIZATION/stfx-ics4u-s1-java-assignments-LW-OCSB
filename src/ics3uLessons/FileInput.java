package ics3uLessons;

import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		// 3 parallel arrays
		String[] products = new String[5];
		int[] quantity = new int[5];
		double[] price = new double[5];
		
		try {
			
			// open the file
			FileReader file = new FileReader("inventory.txt");
			
			// put contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
									
			for(int i=0; i<products.length; i++)  {
										
				products[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());     
				price[i] = Double.parseDouble(buffer.readLine());
			}
									
			// clear memory
			buffer.close();
		}
		
		catch(Exception e)  {
			
			System.out.println("Error reading file or buffer.");
		}
		
		// print contents of parallel arrays
		for(int i=0; i<products.length; i++)  {
			
			System.out.println(products[i] + " " + quantity[i] + " " + price[i]);
		}
	}
}
