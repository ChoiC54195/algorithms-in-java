package DataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// Stack
		// LIFO(Last In First Out) 후입선출
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < 10 ; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int e = stack.pop();
			System.out.println(e);
		}
	}

}
