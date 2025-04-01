package lessons;
import java.util.ArrayList;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {

		// variables
		String[] food = {"pasta", "fruit", "donuts", "veggies", "pizza"};	
	
		try  {
			
			// create file
			FileOutputStream fout = new FileOutputStream("C:\\Users\\e28166\\Desktop\\food.txt");
			
			// create buffer (think "Scanner")
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// create file writer (think "System.out.println" but to file)
			OutputStreamWriter out = new OutputStreamWriter(bout);
			
			// write contents of array into file
			for(int i=0; i<food.length; i++)  {
				
				out.write(food[i] + "\n");
			}
			
			// memory cleanup
			out.flush();
			out.close();
			
		}
		
		catch(Exception e)  {
			
			e.printStackTrace();
		}

	}

}
