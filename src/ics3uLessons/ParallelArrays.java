package ics3uLessons;

public class ParallelArrays {

	public static void main(String[] args) {

		// create 3 arrays
		String[] name = {"Amal", "Sadman", "Geetansh", "Ayaan"};
		int[] money = {5, 12, 50, 200};
		String[] reason = {"borrowed", "bribe", "randsom", "theft"};
		
		

		for(int i=0; i<name.length; i++)  {
			
			System.out.println(name[i] + " " + money[i] + " " + reason[i]);
		}
		
	}

}
