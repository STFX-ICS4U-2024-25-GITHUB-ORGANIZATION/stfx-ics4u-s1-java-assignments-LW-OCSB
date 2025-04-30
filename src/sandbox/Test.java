package sandbox;
import myMethods.MyMethods;

public class Test {

	public static void main(String[] args) {
		
		int[] myArray = {8, 6, 1, 5, 7, 0, 9, 3, 4, 2};
		
		for(int i=0; i<myArray.length; i++) {
			
			System.out.print(myArray[i] + " ");
		}
		
		
		recursiveBubbleSort(myArray);
		
		

	}
	
	public static void recursiveBubbleSort(int[] a) {
		for(int i=0; i<a.length - 1;i++) {
			if (a[i] > a[i+1]) {
				MyMethods.swap(a, i, i+1);
				recursiveBubbleSort(a);
			}
		
		}
	}
}