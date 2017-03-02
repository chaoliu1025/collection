package org.lc.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//add();
		//remove();
		//element();
		//offer();
		//poll();
		//peek();
		//put();
		take();
	}
	
	
	/*add 增加一个元索   如果队列已满，则抛出一个IIIegaISlabEepeplian异常*/
	public static void add(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
		arrayBlockingQueue.add("a");
		arrayBlockingQueue.add("b");
		arrayBlockingQueue.add("c");
	}
	
	/*remove 移除并返回队列头部的元素   如果队列为空，则抛出一个NoSuchElementException异常*/
	public static void remove(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
		arrayBlockingQueue.add("a");
		arrayBlockingQueue.add("b");
		Object a = arrayBlockingQueue.remove();
		System.out.println(a);
		Object b = arrayBlockingQueue.remove();
		System.out.println(b);
		arrayBlockingQueue.remove();
	}
	
	/*element 返回队列头部的元素     如果队列为空，则抛出一个NoSuchElementException异常*/
	public static void element(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
	//	arrayBlockingQueue.add("a");
		Object a = arrayBlockingQueue.element();
		System.out.println(a);
		
	}
	
	/*offer 添加一个元素并返回true 如果队列已满，则返回false*/
	public static void offer(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
		boolean a = arrayBlockingQueue.offer("a");
		System.out.println(a);
		boolean b = arrayBlockingQueue.offer("b");
		System.out.println(b);
		boolean c = arrayBlockingQueue.offer("c");
		System.out.println(c);
		
	}
	
	/*poll 移除并返问队列头部的元素    如果队列为空，则返回null*/
	public static void poll(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
		arrayBlockingQueue.add("a");
		Object a = arrayBlockingQueue.poll();
		System.out.println(a);
		Object b = arrayBlockingQueue.poll();
		System.out.println(b);
		
	}
	
	/*peek 返回队列头部的元素     如果队列为空，则返回null*/
	public static void peek(){
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
//		arrayBlockingQueue.add("a");
		Object a = arrayBlockingQueue.peek();
		System.out.println(a);
	}
	
	/*put 添加一个元素    如果队列满，则阻塞*/
	public static void put() throws InterruptedException{
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
		arrayBlockingQueue.put("a");
		arrayBlockingQueue.put("b");
		arrayBlockingQueue.put("c");
		
		System.out.println("--put 完成--");
	}
	
	/*take 移除并返回队列头部的元素     如果队列为空，则阻塞*/
	public static void take() throws InterruptedException{
		ArrayBlockingQueue<Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(2);
//		arrayBlockingQueue.add("a");
		Object a = arrayBlockingQueue.take();
		System.out.println(a);
		
		System.out.println("--take 完成--");
		
	}

}
