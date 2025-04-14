package lessons;

public class Split {

	public static void main(String[] args) {

		String myString = "carrot, lettuce, sprouts, broccoli";
		String[] myArray = null;
		
		myArray = myString.split(",");
		
		for (int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
		}
		

	}

}
