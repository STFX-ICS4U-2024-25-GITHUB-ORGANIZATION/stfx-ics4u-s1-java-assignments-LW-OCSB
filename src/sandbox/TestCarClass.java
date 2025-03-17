package sandbox;

import myClasses.Car;

public class TestCarClass {

	public static void main(String[] args) {


		String myString = "fubar";
		
		String myString2 = new String("fubar");

		Math.round(3.22);
		
		Car myCar1 = new Car();
		Car myCar2 = new Car(2400, "beetle", 192000, 2001);
		Car myCar3 = new Car(3000, "westfaila", 247000, 1987);
		
		myCar1.setPrice(2343232);
		myCar2.setPrice(3453);
		myCar3.setPrice(23242);
		
		System.out.println(myCar1.getPrice());
		System.out.println(myCar2.getPrice());
		System.out.println(myCar3.getPrice());
		
		System.out.println(myCar1);
		System.out.println(myCar2);
		System.out.println(myCar3);
		
	}

}
