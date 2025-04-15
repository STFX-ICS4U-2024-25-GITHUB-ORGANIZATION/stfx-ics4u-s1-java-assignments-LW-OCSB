package lessons;

public class Split {

	public static void main(String[] args) {

		String[] myArray = null;
		String myString = "carrot, lettuce, sprouts, broccoli";
		
		myArray = myString.split(",");
		
		for (int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
		}
	}
}
