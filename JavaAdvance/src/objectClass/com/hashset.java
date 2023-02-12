package objectClass.com;

/*Java HashSet class is used to create a collection that uses a hash table for storage. 
It inherits the AbstractSet class and implements Set interface.
HashSet contains unique elements only.*/

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(16);

		hs.add(1);
		hs.add(2);
		hs.add(8);
		hs.add(1);// HashSet not contain duplicate..This is the main diff. between list and set.
		hs.add(6);
		System.out.println(hs);
        
		hs.remove(8);//remove an element
        System.out.println(hs);
        
        System.out.println(hs.contains(2));//returns true if object present else false
	}
}
