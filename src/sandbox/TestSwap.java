package sandbox;

import myMethods.MyMethods;

public class TestSwap {

	public static void main(String[] args) {

		int[] myArray = {1, 2};
		
		for(int i=0; i<myArray.length; i++)  {
			System.out.println(myArray[i]);
		}
		
		MyMethods.swap(myArray, 0, 1);
		
		for(int i=0; i<myArray.length; i++)  {
			System.out.println(myArray[i]);
		}
		

	}

}
