package sandbox;

import myObjects.Animal;

public class ObjectTest { 

	public static void main(String[] args) {

		// variables
		Animal myAnimal = new Animal("purple", "land", 13);
		
		
		System.out.println(myAnimal.getColor());
		System.out.println(myAnimal.getHabitat());
		System.out.println(myAnimal.getAge());
		
		System.out.println(myAnimal.toString());
		
	}

}
