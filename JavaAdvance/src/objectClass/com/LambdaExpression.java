package objectClass.com;

@FunctionalInterface
interface abcd {
	 public void method1(int a, int b);
}

public class LambdaExpression {
	public static void main(String[] args) {
		// Lambda expression
		abcd obj1 = (a, b) -> {
			System.out.println("Addition of " + a + " and " + b + " is = " + (a + b));
		};
		obj1.method1(100, 200);
	}
}

/*
 * Lambda expression is a new and important feature of Java which was included
 * in Java SE 8. It provides a clear and concise way to represent one method
 * interface using an expression.
 */

/*
 * The Lambda expression is used to provide the implementation of an interface
 * which has functional interface. It saves a lot of code. In case of lambda
 * expression, we don't need to define the method again for providing the
 * implementation. Here, we just write the implementation code.
 */