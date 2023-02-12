package objectClass.com;

/*ArrayList- Resizable-array implementation of the List interface. Implements all optional list operations, 
and permits all elements, including null. In addition to implementing the List interface, this 
class provides methods to manipulate the size of the array that is used internally to store the list.
*/

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		// This is a generic syntax of ArrayList
		ArrayList<Integer> l1 = new ArrayList<>();

		// create another object(l2) and copy into l1;
		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(15);
		l2.add(17);
		l2.add(66);

		l1.add(6);
		l1.add(5);
		l1.add(4);
		l1.add(6);
		l1.add(10);
		l1.add(0, 5);
		l1.addAll(0, l2);// add l2 elements from index 0

		// l1.clear();//clear the list

		for (int i = 0; i < l1.size(); i++) {

			System.out.print(l1.get(i) + " , ");

		}

		// this method return a boolean if elements is present
		// they print true if not they print false
		System.out.println("\n" + l1.contains(9));

		// This method Returns the index of given element.
		System.out.println(l1.indexOf(4));

		// If element present in 2 places in a list so IndexOf taken her first index.
		System.out.println(l1.indexOf(6));

		// print the last index of duplicate elements
		System.out.println(l1.lastIndexOf(6));

		// Remove an element from the given index
		l1.remove(6);
		// 4 were deleted

		// set method add the element in a given index
		l1.set(0, 200);

		for (int i = 0; i < l1.size(); i++) {

			System.out.print(l1.get(i) + " , ");

		}
		
		//Check the list is empty or not(return boolean)
		System.out.println("\n"+l1.isEmpty());
	}
}
