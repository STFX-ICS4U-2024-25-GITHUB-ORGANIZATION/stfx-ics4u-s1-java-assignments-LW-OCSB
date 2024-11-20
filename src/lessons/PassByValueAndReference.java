package lessons;

public class PassByValueAndReference {

	public static void main(String[] args) {

		int myInteger = 7;
		passByValue(7);
		System.out.println(myInteger);

		int[] myArray = {4};
		passByReference(myArray);
		System.out.println(myArray[0]);
		
	}

	public static void passByValue(int n)  {
		
		n = 13;
	}
	
	public static void passByReference(int[] a)  {
		
		a[0] = 99;
	}
	
}
