package org.lc.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		//push();
		peek();
	}
	
	public static void push(){
		Stack<Object> stack = new Stack<Object>();
		stack.push("a");
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
	public static void peek(){
		Stack<Object> stack = new Stack<Object>();
		stack.push("a");
		System.out.println(stack.peek());
		System.out.println(stack.size());
	}
}
