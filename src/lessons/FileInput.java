package lessons;
import java.io.*;
import java.util.ArrayList;

public class FileInput {

	public static void main(String[] fubar)  {
		
		// variables
		ArrayList<String> flavours = new ArrayList();
		BufferedReader br = null;
		String word = "";
		
		// read file
		try  {
			
			// opens file
			br = new BufferedReader(new FileReader("src/flavours.txt"));

			// read file, add contents to ArrayList
			while(	(word = br.readLine()) != null   )  {
				
				flavours.add(word);
			}
			
			// close the file
			br.close();
		}
		
		catch (Exception e)  {
			
			e.printStackTrace();
		}
		
		// print ArrayList
		for (int i=0; i<flavours.size(); i++)  {
			
			System.out.println(flavours.get(i));
		}
	}
	
	
	
}
