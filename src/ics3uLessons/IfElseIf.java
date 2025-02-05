package ics3uLessons;

public class IfElseIf {

	public static void main(String[] args) {

		// variables
		int num1 = 7;
		int num2 = 13;
		
		if (num1 > num2)  {
			
			System.out.println("if block executed");
		}
		
		else if (num1 == num2)  {
			
			System.out.println("else if block executed");
		}

		else  {
			
			System.out.println("else block executed");
		}
	}

}
