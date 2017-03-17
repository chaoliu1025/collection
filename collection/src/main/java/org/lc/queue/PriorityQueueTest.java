package org.lc.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
	//	test1();
	//	test2();
		test3();
	}
	
	public static void test1(){
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(10);
		pq.add(22);
		pq.addAll(Arrays.asList(new Integer[]{11, 12, 34, 2, 7, 4, 15, 12, 8, 6, 19, 13 }));
		while(pq.peek()!=null){
		    System.out.print(pq.poll() + " ");
		}
	}
	
	public static void test2(){
		Queue<Integer> pq = new PriorityQueue<>(11, Collections.reverseOrder());
		pq.offer(10);
		pq.add(22);
		pq.addAll(Arrays.asList(new Integer[]{11, 12, 34, 2, 7, 4, 15, 12, 8, 6, 19, 13 }));
		while(pq.peek()!=null){
		    System.out.print(pq.poll() + " ");
		}
	}
	
	public static void test3(){
		Comparator<Task> taskComparator = new Comparator<Task>() {

		    @Override
		    public int compare(Task o1, Task o2) {
		        if(o1.getPriority()>o2.getPriority()){
		            return -1;
		        }else if(o1.getPriority()<o2.getPriority()){
		            return 1;
		        }
		        return 0;
		    }
		};
		
		Queue<Task> tasks = new PriorityQueue<Task>(11, taskComparator);
		tasks.offer(new Task(20, "写日记"));
		tasks.offer(new Task(10, "看电视"));
		tasks.offer(new Task(100, "写代码"));

		Task task = tasks.poll();
		while(task!=null){
		    System.out.print("处理任务: "+task.getName()
		            +"，优先级:"+task.getPriority()+"\n");
		    task = tasks.poll();
		}
	}
	
	static class Task {
	    int priority;
	    String name;
	    
	    public Task(int priority, String name) {
	        this.priority = priority;
	        this.name = name;
	    }

	    public int getPriority() {
	        return priority;
	    }
	    
	    public String getName() {
	        return name;
	    }
	}
}
