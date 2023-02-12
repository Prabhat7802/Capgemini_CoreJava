package objectClass.com;

import java.util.Scanner;

class ManipulateOperation {

	// Create constructor
	public ManipulateOperation(String S1, String S2) {
		System.out.println(S1 + " " + S2);// concatenation
		System.out.println(S1.concat(S2));
		System.out.println(S1.charAt(5));// access a character at given index
		System.out.println(S1.toLowerCase());// change string to lowercase
		System.out.println(S1.toUpperCase());// change string to uppercase
		System.out.println(S1.length());
		System.out.println(S1.substring(0, 5));
		System.out.println(S1.isEmpty());// check the string is empty or not

		// Reverse a string
		System.out.println("Actual String: " + S1);
		System.out.print("String reverse: ");
		for (int i = S1.length() - 1; i >= 0; i--) {
			System.out.print(S1.charAt(i));
		}

	}
}

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string 1: ");
		String S1 = sc.nextLine();
		System.out.println("Enter a string 2: ");
		String S2 = sc.nextLine();

		ManipulateOperation obj = new ManipulateOperation(S1, S2);

	}
}
