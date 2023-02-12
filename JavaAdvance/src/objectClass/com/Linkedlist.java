package objectClass.com;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();

		// All the ArrayList methods are same in linklist.let's discuss some another
		// method
		// that are present in linkedlist.

		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);

		// Add element in first or last index.
		l1.addFirst(1);
		l1.addLast(7);
		for (int i : l1) {
			System.out.print(i + " ");
		}

	}

}

//What is Linked List.
/*
 * Linked List can be defined as collection of objects called nodes that are
 * randomly stored in the memory. A node contains two fields i.e. data stored at
 * that particular address and the pointer which contains the address of the
 * next node in the memory.
 */

//In linked List we have previous and next reference and an value .

//Difference Between ArrayList and Linked List.
/*
 * Although ArrayList & LinkedList both implement the List interface and have
 * the same methods, it is important to understand when to use which one.
 * 
 * The insertion & deletion can be done in constant time in Linked List, so it
 * is best to use the linked list when you need to add or remove elements
 * frequently.But, in arrays/ArrayList, if we want to add or delete an element
 * in between then, we need to shift all the other elements.
 * 
 * Use ArrayList when you want to access the random elements frequently, as it
 * can’t be done in a linked list in constant time.
 */
