package lessons;

public class Mammal extends Animal {

	// data members
	private boolean fur;
	
	// default constructor
	public Mammal()  {
		
		super();
		this.fur = false;
	}
	
	// parameterized constructor
	public Mammal(String c, String h, int a, boolean f) {
		
		super(c, h, a);
		this.fur = f;
	}
	
	
	
	// get methods
	public boolean getFur()  {
		
		return this.fur;
	}
	
	// set methods
	public void setFur(boolean f)  {
		
		this.fur = f;
	}
	
	// toString
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.fur;
	}
}
