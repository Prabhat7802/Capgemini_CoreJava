package Collection.com;

import java.util.Comparator;
import java.util.TreeSet;

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		
		if(person1.getWeight() > person2.getWeight()) {
			return 1;
		}
		else if(person1.getWeight() == person2.getWeight()) {
			if(person1.getHeight() > person2.getHeight()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}

}


class Person {
	private String name;
	private int height;
	private double weight;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
}


public class Assignment3Q1 {

	public static void main(String[] args) {
		
		Person person1 = new Person("Aditya Sharma", 160, 80);
		Person person2 = new Person("Abhiraj Singh", 180, 70);
		Person person3 = new Person("Abhijeet Verma", 150, 68);
		Person person4 = new Person("Anand rajput", 175, 80);
	
		PersonComparator personComparator = new PersonComparator();
		TreeSet<Person> set = new TreeSet<>(personComparator);
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		
		for(Person person: set) {
			System.out.println("Name: " + person.getName() + "  Height: " + person.getHeight() + "  Weight: " + person.getWeight());
			System.out.println();
		}
		
	}

}