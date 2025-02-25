package lessons;
import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {

		int myInt = 13;				// primitive data type
		Integer myInteger = 13;		// Object
		
		double myDouble =  13.0;
		Double myDoubleObject = 13.0;
		
		boolean myBoolean = true;
		Boolean myBooleanObject = false;
		
		char myChar = 'z';
		Character myCharacter = 'z';
		
		ArrayList<Integer> myArrayList = new ArrayList();
		
		myArrayList.add(myInteger);
		myArrayList.add(13);			// Auto "boxing"
		
		
		
		
		
		

	}

}
