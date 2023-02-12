package objectClass.com;

//The stack is the subclass of Vector. It implements the last-in-first-out data structure . 

//The stack contains all of the methods of Vector class and also provides its methods like
//boolean push(), boolean peek(), boolean push(object o), which defines its properties.

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(1);//add the elements 
		s.push(2);
		s.push(3);
		s.push(4);

		
		for(int j:s) {
			System.out.print(j+" ");
		}
		
		s.pop();//popout the last element
		s.pop();
		
		System.out.println();
		for(int j:s) {
			System.out.print(+j+" ");
		}
		s.push(10);
		System.out.println("\n"+s.search(0));//search the element present or not return 1 if present else -1
		System.out.println(s.peek());//return top of this stack without removing it from the stack.
		
	}
}
