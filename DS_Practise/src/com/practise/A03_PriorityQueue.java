package com.practise;

import java.util.*;


public class A03_PriorityQueue {

	public static void main(String[] args) {
		
		//PRIORITY QUEUE - A FIFO data structure thet serves
		//				 elements with the highest priorites first
		//				 before element with lowest priority
		//				Usually in asceneding order
		//	Used to display in descending order
		// PriorityQueue<>(Collections.reverseOrder())
		
		
		Queue<Double> priorityQueue1 = new PriorityQueue<Double>();
		//Ascending Order by Default
		System.out.println(priorityQueue1.isEmpty());
		priorityQueue1.offer(2.5);
		priorityQueue1.offer(1.5);
		priorityQueue1.offer(0.5);
		priorityQueue1.offer(4.5);
		System.out.println(priorityQueue1);
		System.out.println(priorityQueue1.isEmpty());
		while(!priorityQueue1.isEmpty()){
			System.out.println(priorityQueue1.poll());
		}
		//Descending order
		Queue<Double> priorityQueue2 = new PriorityQueue<Double>(Collections.reverseOrder());
		System.out.println(priorityQueue2.isEmpty());
		priorityQueue2.offer(2.5);
		priorityQueue2.offer(1.5);
		priorityQueue2.offer(0.5);
		priorityQueue2.offer(4.5);
		System.out.println(priorityQueue2);
		System.out.println(priorityQueue2.isEmpty());
		while(!priorityQueue2.isEmpty()){
			System.out.println(priorityQueue2.poll());
		}
		
		Queue<String> priorityQueue3 = new PriorityQueue<String>();
		//Ascending Order by Default
		System.out.println(priorityQueue3.isEmpty());
		priorityQueue3.offer("C");
		priorityQueue3.offer("A");
		priorityQueue3.offer("D");
		priorityQueue3.offer("B");
		System.out.println(priorityQueue3);
		System.out.println(priorityQueue3.isEmpty());
		while(!priorityQueue3.isEmpty()){
			System.out.println(priorityQueue3.poll());
		}
		//Descending order
		Queue<String> priorityQueue4 = new PriorityQueue<String>(Collections.reverseOrder());
		System.out.println(priorityQueue4.isEmpty());
		priorityQueue4.offer("C");
		priorityQueue4.offer("A");
		priorityQueue4.offer("D");
		priorityQueue4.offer("B");
		System.out.println(priorityQueue4);
		System.out.println(priorityQueue4.isEmpty());
		while(!priorityQueue4.isEmpty()){
			System.out.println(priorityQueue4.poll());
		}
	}

	
	
	
}
