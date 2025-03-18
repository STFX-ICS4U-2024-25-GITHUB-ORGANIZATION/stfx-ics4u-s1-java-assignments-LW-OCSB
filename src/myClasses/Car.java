package myClasses;

public class Car {

	// data members
	private double price;
	private String model;
	private int year;
	private int mileage;
	
	// default constructor
	public Car()  {
		
		this.price = 0.00;
		this.model = "";
		this.year = 0;	
		this.mileage = 0;
	}
	
	// parameterized constructor
	public Car(double p, String mo, int y, int mi)  {

		this.price = p;
		this.model = mo;
		this.year = y;	
		this.mileage = mi;
			
	}

	// get methods
	public double getPrice()  {
		
		return this.price;
	}
	
	public String getModel()  {
		
		return this.model;
	}

	public int getYear()  {
		
		return this.year;
	}
	
	public int getMileage()  {
		
		return this.mileage;
	}

	
	// set methods
	public void setPrice(double p)  {
		
		this.price = p;
		
	}
	
	public void setModel(String mo)  {
		
		this.model = mo;
		
	}

	public void setYear(int y)  {
	
		this.year = y;
	
	}

	public void setMileage(int mi)  {
		
		this.mileage = mi;
	
	}
	
	
	// .toString()
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.price + "." + this.model + "." + this.year
			+ "." + this.mileage;
	}
}
