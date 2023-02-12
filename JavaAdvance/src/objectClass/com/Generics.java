package objectClass.com;

/*The Java Generics programming is introduced  to deal with type-safe objects.
It makes the code stable by detecting the bugs at compile time.

Before generics, we can store any type of objects in the collection, i.e., non-generic. 
Now generics force the java programmer to store a specific type of objects.
*/


import java.util.ArrayList;

//my generic class--here we pass T1 AND T2 are the types.
class MyGeneric<T1, T2> {
	int val;
	private T1 t1;
	private T2 t2;

	MyGeneric(int val, T1 t1, T2 t2) {
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}

	public T1 getT1() {
		return t1;
	}

	public T2 getT2() {
		return t2;
	}
}

public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		// ArrayList<int> al1=new ArrayList<>();--we can't write int because this is
		// primitive data types.

		al.add(22);
		al.add(32);

		// al.add("Aman");--we can't add string because we already defined a integer
		// data type.

		System.out.println(al);

		MyGeneric<String, Integer> mg = new MyGeneric<>(22, "aman", 21);

		String str = mg.getT1();
		int a = mg.getT2();

		System.out.println(str);
		System.out.println(a);

	}
}
