package com.practise;

import java.util.LinkedList;
import java.util.Queue;

public class A02_Queue {

	public static void main(String[] args) {
		
		//QUEUE - FIFO Data structure .First In First Out
		//		Example : Line of People
		//		A collection designed for holding elements prior to processing
		//		Linear Data structure
				
		//	Methods :
		//		1.add element - enqueue()/offer()
		//		2.remove element - dequeue()/poll()
		//		3.returns head of the element - element()/peek()
		
		/*Queue<String> queue = new Queue<String>();*/
		//Error - Cannot instantiate the type Queue<String>
		//		Queue is an interface and not a class
		//		An interface cannot be instantiated
		//		Queue is implemented by 2 classes
		//		1.LinkedList
		//		2.PriorityQueue
		//		Queue is inherited from Collection 
		//		Methods ineherited from Collection:
		//			1.isEmpty()
		//			2.size()
		//			3.contains(obj)
		
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty());
		queue.offer("Print_Job1");
		queue.offer("Print_Job2");
		queue.offer("Print_Job3");
		queue.offer("Print_Job4");
		queue.offer("Print_Job5");
		
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.contains("Print_Job1"));
		//USES OF QUEUE
		//	1.Keyboard Buffer(letters should appear on the screen in the
		//	  order it's typed)
		//	2.Printer Queue(Print Jobs should be completed in order)
		//	3.Used in LinkedList,PriorityQUeue,Breadth_first search
			
					
		

	}

}
