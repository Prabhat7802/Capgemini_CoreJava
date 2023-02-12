package javaQ1;

//Abstract class/methods

abstract class Animal {

	abstract void walk();

	Animal() {
		System.out.println("You are creating a animal");
	}

	public void eat() {
		System.out.println("animals are eating");
	}
}

class Horse extends Animal {
	public void walk() {
		System.out.println("Animals are walking with 2 legs");
	}
}

class Chicken extends Animal {
	Chicken() {
		System.out.println("This is chicken class constructor");
	}

	public void walk() {
		System.out.println("Animals are walking with 4 legs");
	}
}

public class Abstraction {
	public static void main(String[] args) {
  
  
  Horse h= new Horse();
  h.walk(); 
  Chicken c=new Chicken();
  c.walk(); 
  //Animal a = new Animal(); } 
 
	}}
	

//Interfaces
/*
 * interface Animal{ public void walk(); }
 * 
 * interface Herbivore{ public void plant(); } class Lion implements
 * Animal,Herbivore{
 * 
 * @Override public void walk() { System.out.println("All animals are walking");
 * 
 * }
 * 
 * @Override public void plant() {
 * System.out.println("All animals are eating plants");
 * 
 * }
 * 
 * 
 * }
 * 
 * public class Abstraction { public static void main(String[] args) { Lion
 * l=new Lion(); l.walk(); l.plant();
 * 
 * 
 * } }
 */