package myClasses;

public class Car {

	// data members
	private double price;
	private String model;
	private int mileage;
	private int year;
	
	// default constructor
	public Car()  {
		
		this.price = 0.00;
		this.model = "";
		this.mileage = 0;
		this.year = 0;		
	}
	
	// parameterized constructor
	public Car(double p, String mo, int mi, int y)  {

		this.price = p;
		this.model = mo;
		this.mileage = mi;
		this.year = y;		
	}

	// get methods
	public double getPrice()  {
		
		return this.price;
	}
	
	public String getModel()  {
		
		return this.model;
	}
	
	public int getMileage()  {
		
		return this.mileage;
	}
	
	public int getYear()  {
		
		return this.year;
	}
	
	
	// set methods
	public void setPrice(double p)  {
		
		this.price = p;
		
	}
	
	public void setModel(String mo)  {
		
		this.model = mo;
		
	}

	public void setMileage(int mi)  {
	
		this.mileage = mi;
	
	}

	public void setYear(int y)  {
	
		this.year = y;
	
	}

	// .toString()
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.price + "." + this.model + "." + this.mileage
			+ "." + this.year;
	}
}
