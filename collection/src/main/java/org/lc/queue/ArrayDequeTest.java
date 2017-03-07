package org.lc.queue;
import java.util.ArrayDeque;
 

public class ArrayDequeTest {

	public static void main(String[] args) {
		//addFirst();
		//addLast();
		//offerFirst();
		//offerLast();
		//removeFirst();
		//removeLast();
		//getFirst();
		//getLast();
		//peekFirst();
		//allocateElements(10);
		tailTest();
		
	}
	
	
	public static void addFirst(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.addFirst("b");
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.size());
	}
	
	public static void addLast(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.addLast("b");
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque.size());
	}
	
	public static void offerFirst(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerFirst("b");
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.size());
	}
	
	public static void offerLast(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerLast("b");
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque.size());
	}
	
	public static void removeFirst(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerFirst("b");
		System.out.println(arrayDeque.removeFirst());
		System.out.println(arrayDeque.size());
	}
	
	public static void removeLast(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerLast("b");
		System.out.println(arrayDeque.removeLast());
		System.out.println(arrayDeque.size());
	}
	
	public static void getFirst(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerFirst("b");
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.size());
	}
	
	public static void getLast(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerLast("b");
		System.out.println(arrayDeque.getLast());
		System.out.println(arrayDeque.size());
	}
	
	public static void peekFirst(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerFirst("b");
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque.size());
	}
	
	public static void removeFirstOccurrence(){
		ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
		arrayDeque.add("a");
		arrayDeque.offerFirst("b");
	}
	
	public static void allocateElements(int numElements) {
		int initialCapacity = 8;
		// Find the best power of two to hold elements.
		// Tests "<=" because arrays aren't kept full.
		if (numElements >= initialCapacity) {
			initialCapacity = numElements;
			initialCapacity |= (initialCapacity >>>  1);
			initialCapacity |= (initialCapacity >>>  2);
			initialCapacity |= (initialCapacity >>>  4);
			initialCapacity |= (initialCapacity >>>  8);
			initialCapacity |= (initialCapacity >>> 16);
			System.out.println(initialCapacity);
			initialCapacity++;
			
			if (initialCapacity < 0)   // Too many elements, must back off
				initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements
		}
		
		System.out.println(initialCapacity);
	}
	
	public static void tailTest(){
		int tail =-2;
		int[] elements = new int[8];
		System.out.println((tail + 1) & (elements.length - 1));
	}
}
