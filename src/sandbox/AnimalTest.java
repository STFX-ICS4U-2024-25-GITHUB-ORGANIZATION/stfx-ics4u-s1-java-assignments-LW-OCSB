package sandbox;

import lessons.Mammal;

public class AnimalTest {

	public static void main(String[] args) {

		Mammal myMammal = new Mammal();
		
		myMammal.setColour("blue");
		myMammal.setHabitat("water");
		myMammal.setAge(4);
		myMammal.setFur(true);
		
		System.out.println(myMammal.getColour());
		System.out.println(myMammal.getHabitat());
		System.out.println(myMammal.getAge());
		System.out.println(myMammal.getFur());
		System.out.println(myMammal.toString());

		Mammal myMammal2 = new Mammal("purple", "land", 13, true);
		System.out.println(myMammal2.getColour());
		System.out.println(myMammal2.getHabitat());
		System.out.println(myMammal2.getAge());
		System.out.println(myMammal2.getFur());
		System.out.println(myMammal2.toString());
		
	}

}
