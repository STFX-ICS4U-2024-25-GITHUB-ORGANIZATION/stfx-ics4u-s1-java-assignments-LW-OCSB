package sandbox;

import lessons.Animal;

public class AnimalTest {

	public static void main(String[] args) {

		Animal myAnimal = new Animal("blue", "land", 7);
		
		System.out.println(myAnimal.getColour());
		System.out.println(myAnimal.getHabitat());
		System.out.println(myAnimal.getAge());
		System.out.println(myAnimal.toString());

	}

}
