package myClasses;

public class Car extends Vehicle {

	// data members
	private int mileage;
	
	// default constructor
	public Car()  {
		
		super();
		this.mileage = 0;
	}
	
	// parameterized constructor
	public Car(double p, String mo, int y, int mi)  {
		
		super(p, mo, y);
		this.mileage = mi;
	}
	
	// get methods
	public int getMileage()  {
		
		return this.mileage;
	}
	
	// set methods
	public void setMileage(int mi)  {
		
		this.mileage = mi;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.mileage;
	}
	
	
	
}
