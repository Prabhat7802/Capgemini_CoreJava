package objectClass.com;

//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the 
//normal flow of the application can be maintained.

//In Java, an exception is an event that disrupts the normal flow of the program. 
//It is an object which is thrown at runtime.

/*1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
For example, IOException, SQLException, etc. Checked exceptions are  checked at compile-time.
*/

/*2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions. 
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.*/

/*3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.*/

//try block
/*The "try" keyword is used to specify a block where we should place an exception code. 
It means we can't use try block alone. The try block must be followed by either catch or finally.


//catch block
The "catch" block is used to handle the exception. 
It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

*///try,catch
public class DemoException {
	public static void main(String[] args) {

		int i, j, k = 0;
		int a[] = new int[4];
		i = 8;
		j = 0;// 0

		try {
			// arithmetic exception
			k = i / j;

			// arrayOutOfbound exception
			for (int c = 0; c <= 4; c++) {
				a[c] = c + 1;
			}

			for (int value : a) {
				System.out.println(value);
			}
		}

		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero " + e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("maximum number of values");
		} 
		catch (Exception e) {
			System.out.println("unknown exception");
		}
		System.out.println(k);
	}
}
