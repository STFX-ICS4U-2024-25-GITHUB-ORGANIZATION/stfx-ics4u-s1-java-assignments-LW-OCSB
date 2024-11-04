package lessons;
import java.util.ArrayList;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		// create .txt file under src
		// right-click repository -> new -> file
		// DO NOT RIGHT-CLICK src
		
		// variables
		ArrayList<String> colours = new ArrayList();
		BufferedReader br = null;
		String word = "";
		
		try  {
			
			// open file
			br = new BufferedReader(new FileReader("colours.txt"));
			
			// read file, line-by-line, until end of file
			// add contents to ArrayList
			while( (word = br.readLine()) != null )  {
				
				colours.add(word);	
			}
			
			br.close();
		}
		
		catch(Exception e)  {
			
			e.printStackTrace();
		}
		
		// print ArrayList to check:
		for (int i=0; i<colours.size(); i++)  {
			
			System.out.println(colours.get(i));
		}
		
	}

}
