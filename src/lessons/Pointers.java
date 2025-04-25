package lessons;

public class Pointers {

	public static void main(String[] args) {

		int myInteger = 7;
		passByValue(myInteger);
		System.out.println(myInteger);
		
		int[] myArray = {32};
		passByReference(myArray);
		System.out.println(myArray[0]);
	}

	public static void passByReference(int[] a)  {
		
		a[0] = 66;
	}
	
	public static void passByValue(int n)  {
		
		n = 13;
	}
	
	
	
}
