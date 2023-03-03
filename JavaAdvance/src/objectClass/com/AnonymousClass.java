package objectClass.com;

interface DemoAnonymous {
	public void meth1();

	public void meth2();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAnonymous obj = new DemoAnonymous() {

			@Override
			public void meth1() {
				// TODO Auto-generated method stub

			}

			@Override
			public void meth2() {
				// TODO Auto-generated method stub
				System.out.println("Method2 call");
			}

		};
		obj.meth2();

	}

}

/*
 * It is an inner class without a name and for which only a single object is
 * created. An anonymous inner class can be useful when making an instance of an
 * object with certain “extras” such as overriding methods of a class or
 * interface, without having to actually subclass a class.
 */