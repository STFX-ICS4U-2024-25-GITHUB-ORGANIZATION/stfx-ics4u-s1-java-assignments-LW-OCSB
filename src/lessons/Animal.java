package lessons;

public class Animal {

	// data members
	private String colour;
	private String habitat;
	private int age;
	
	
	// Default Constructor
	public Animal() {
		
		this.colour = "";
		this.habitat = "";
		this.age = 0;
	}
	
	// Parameterized Constructor
	public Animal(String c, String h, int a) {
		
		this.colour = c;
		this.habitat = h;
		this.age = a;
	}
	
	// get methods
	public String getColour()  {
		
		return this.colour;
	}
	
	public String getHabitat()  {
		
		return this.habitat;
	}

	public int getAge()  {
		
		return this.age;
	}
	
	// set methods
	public void setColour(String c)  {
		
		this.colour = c;
	}
	
	public void setHabitat(String h)  {
		
		this.habitat = h;
	}

	public void setAge(int a)  {
		
		this.age = a;
	}

	// toString
	@Override
	public String toString()  {
		
		return super.toString();
	}

}
