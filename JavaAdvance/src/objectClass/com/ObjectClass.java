package objectClass.com;

public class ObjectClass {

	public static void main(String[] args) {

		ObjectClass obj1 = new ObjectClass();

		ObjectClass obj2 = new ObjectClass();

		System.out.println("toString method: " + obj1.toString());

		System.out.println("Hashcode method: " + obj1.hashCode());

		System.out.println("equals method: " + obj1.equals(obj2) /* obj1.equals(obj1) */);

		System.out.println("getClass method: " + obj1.getClass());

		System.out.println();
	}
}
