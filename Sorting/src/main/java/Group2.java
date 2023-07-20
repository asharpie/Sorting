import java.util.ArrayList;

public class Group2 {

	private ArrayList<Person> people2 = new ArrayList<Person>();
	private String groupName2;
	
	public Group2 (String name) {
		groupName2 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people2.add(new Person(name, id, age));	
	}
	
	public void PrintGroup2() {
		System.out.println("Group 2's name is: " + groupName2);
		//TO DO iterate through the arraylist and use the toString method to output the data held within the arraylist
		for(int i = 0; i < people2.size(); i++) {
			System.out.println(people2.get(i));
		}
	}

	public void selectionSort2() {
		int indexOfSmallestPersonAge;	// an index is always an integer
		Person smallestPersonAge;		// We need to keep track of a Truck not just a cost
		for(int outerControl = 0; outerControl < people2.size() - 1; outerControl++) {

			smallestPersonAge = people2.get(outerControl); // start with the first index
			indexOfSmallestPersonAge = outerControl; // get a Truck Object

			for(int innerControl = outerControl + 1; innerControl < people2.size(); innerControl++) {

				if( people2.get(innerControl).getAge() < smallestPersonAge.getAge()) {
					smallestPersonAge = people2.get(innerControl); // 1. keep up with the Truck with the lowest cost
					indexOfSmallestPersonAge = innerControl; // and the index
				} // ends the if
			} // ends the inner for loop

			people2.set(indexOfSmallestPersonAge, people2.get(outerControl)); // 2.
			people2.set(outerControl, smallestPersonAge); // 3.

		} // ends the outer for loop
	} // ends the method
	
	// TO DO create a selection sort method that sorts the global arraylist
}
