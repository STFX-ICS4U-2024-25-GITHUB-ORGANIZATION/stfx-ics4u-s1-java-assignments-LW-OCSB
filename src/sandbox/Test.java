package sandbox;
import myClasses.Car;

public class Test {

	public static void main(String[] args) {

		
		Car myCar1 = new Car();
		Car myCar2 = new Car(324.44, "beetle", 2000, 240000);
		Car myCar3 = new Car(324.44, "beetle", 2000, 240000);
		System.out.println(myCar2);
		System.out.println(myCar3);
	}

}
