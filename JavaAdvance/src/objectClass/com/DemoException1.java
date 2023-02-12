package objectClass.com;

//finally block

/*The "finally" block is used to execute the necessary code of the program. 
It is executed whether an exception is handled or not.*/


//try,catch,finally
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException1 {
	public static void main(String[] args) {
		int i = 8, j = 1, k = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// BufferedReader class for take a
																					// input in java

		try {

			j = Integer.parseInt(br.readLine());// we have type-cast string to integer
			// because input taken is by default is string
			k = i / j;
			System.out.println(k);//if user give 0 so there exception occur
		} 
		
		
		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero " + e);
		} 
		
		
		catch (IOException e) {
			System.out.println("some input error");
		}

		catch (Exception e) {
			System.out.println("unknown exception");
		}
		
		finally {
			System.out.println("Bye");
		}
	}
}

//if we want to print "bye" anyhow if exception occur or not occur ,then we can use finally.