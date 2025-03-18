package myClasses;

abstract class Vehicle {

	// data members
	protected double price;
	protected String model;
	protected int year;
	
	// default constructor
	public Vehicle()  {
		
		this.price = 0.00;
		this.model = "";
		this.year = 0;	
	}
	
	// parameterized constructor
	public Vehicle(double p, String mo, int y)  {

		this.price = p;
		this.model = mo;
		this.year = y;	
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
	
	// .toString()
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.price + "." + this.model + "." + this.year;
	}
}
