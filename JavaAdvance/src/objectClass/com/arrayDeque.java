package objectClass.com;

//ArrayDeque class implements the Deque interface. Unlike queue, 
//we can add or delete the elements from both the ends.
import java.util.ArrayDeque;

public class arrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();

		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		ad.add(6);
		ad.addFirst(0);// added to first
		ad.addLast(7);// added to last

		for (int i : ad) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + ad.getFirst());// print first element

		System.out.println(ad.getLast());// print last element

		System.out.println(ad.element());// return first element

		System.out.println(ad.peek());// returns first element

		ad.pop();// remove the first element

		for (int i : ad) {
			System.out.print(i + " ");
		}
	}
}
