package lessons;

import java.io.*;
import java.util.ArrayList;
import java.io.*;


public class FileOutput {

	public static void main(String[] args) {

		// variables
		String[] food = {"milk", "bread", "butter", "cheese", "yogurt"};
		
		try {
			
			// create file
			FileOutputStream fout = new FileOutputStream("C:\\Users\\e28166\\desktop\\output.txt");

			// create buffer
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// create writer (like System.out)
			OutputStreamWriter out = new OutputStreamWriter(bout);
			
			// write contents of Array into a file
			for(int i=0; i<food.length; i++)  {

				out.write(food[i] + "\n");
			}
			
			out.flush();
			out.close();
	
		}
		
		catch(Exception e)  {
			
			e.printStackTrace();
		}
		
	}

}
