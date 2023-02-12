package objectClass.com;

public class stringbuffer {
	public static void main(String[] args) {
		
		// In java stringBuffer is a predefined class
		StringBuffer sb = new StringBuffer("Hello");

		sb.append("world");// The append() method concatenates the given argument with this string.
		System.out.println(sb);

		sb.insert(1, "java");// The insert() method inserts the given string with this string at the given
								// position.
		System.out.println(sb);

		sb.replace(0, 2, "java");// This method replaces the given string from the specified beginIndex and
									// endIndex.
		System.out.println(sb);

		sb.delete(0, 3);// The method of StringBuffer class deletes the string from the specified
						// beginIndex to endIndex
		System.out.println(sb);

		sb.reverse();// The reverse() method of StringBuilder class reverses the current string.
		System.out.println(sb);
		

		System.out.println(sb.capacity()); // default 16..but here 21 because we already passed "hello" of length 5
		sb.append("Hello");
		System.out.println(sb.capacity()); // now 21
		sb.append("java is my favourite language");
		System.out.println(sb.capacity()); // Now (21*2)+2=34 i.e (oldcapacity*2)+2

	}
}
