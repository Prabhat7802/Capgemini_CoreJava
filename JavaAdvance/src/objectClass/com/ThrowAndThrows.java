package objectClass.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*throw- The "throw" keyword is used to throw an exception.

throws- The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. 
It doesn't throw an exception. It is always used with method signature.
*/



public class ThrowAndThrows {
	public static void main(String[] args)throws Exception  {
		int i = 8, j , k = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
            System.out.println("Enter a number");
			j = Integer.parseInt(br.readLine());
			
			k = i + j;
			
			
			if(k<10) {
				
				throw new ArithmeticException();
			}
			System.out.println(k);
		} 
		catch (ArithmeticException e) {
			System.out.println("Minimal value for the output is 10 ");
		}
		catch (Exception e) {
			System.out.println("unknown exception");
		}
	}
}
