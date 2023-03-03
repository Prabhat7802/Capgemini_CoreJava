package objectClass.com;

import java.util.*;

//CURSOR-A Java Cursor is an Iterator, which is used to iterate or traverse or retrieve a 
//Collection or Stream object's elements one by one.

//Cursor are of 3 types-Iterator,ListIterator,Enumerations

//Iterator can we used with any of the collection objects
//By using Iterator  cursor we have only retrieve elements in forward direction
//In iterator we have some important  methods-hasNext(),next(),remove()
//In iterator cursor we can read and remove the elements.

//ListIterator can be used only list collection objects ArrayList, Vector, LinkedList, Stack, etc.
//By using listIterator cursor we have  retrieve elements in forward direction and backward direction
//In listiterator we have some imp methods-hasNext(),next(),remove(),hasPrevious(),previous()
//In listiterator cursor we can read ,remove,add,replace the elements.

//hasNext()-Returns true if this list iterator has more elements when
//traversing the list in the forward direction else false.

//next()-Returns the next element in the list and advances the cursor
//position.This method may be called repeatedly to iterate through the list

//hasPrevious()-returns true if elements present in previous.(Traversing previous)

//previous()-Returns the previous element

//By using Enumerations  cursor we have only retrieve elements in forward direction.
//And this was introduced in jdk 1.0
//Enumerations cursor can we used only with legacy classes i.e vector and class
//Enumerations can we get by element() method.
//Enumeration method- hasMoreElement(),hasElement()
//Enumeration cursor is only used to read operation

public class IteratorAndListIteratorAndEnumeration {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
     System.out.println(l);//in set form
     
		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("In reverse direction");

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);

		ListIterator itr1 = l1.listIterator();

		while (itr1.hasNext()) {
			itr1.next();
		}
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

	}
}
