package com.practise;

import java.util.LinkedList;

public class A04_LinkedList {

	public static void main(String[] args) {
		
	//	LINKEDLIST  - 1.Singly Linked List
	//				  2.Doubly Linked List
	//	ADVANTAGES  - 1.Dynamic Data Structures(Allocates needed memory while runing)
	//				  2.Insertion and deletion of node is easy .O(1)
	//				  3.No/Low memory waste
	//	DISADVANTAGE- 1.Greater Memory Usage(Additional Pointer)
	//				  2.No Random Access of Elements(no index[i])
	//				  3.Accessing/searching elements is more time consuming. O(n)
	//	USES       -  1.Implements stack/Queu
	//				  2.GPS Navigation
	//				  3.Music Playlist
		
		//LinkedList as STACK
		LinkedList<String> stackList = new LinkedList<String>();
		stackList.push("D");
		stackList.push("W");
		stackList.push("R");
		stackList.push("A");
		System.out.println(stackList);
		System.out.println(stackList.pop());
		// LinkedList as QUEUE
		LinkedList<String> queueList = new LinkedList<String>();
		queueList.offer("D");
		queueList.offer("W");
		queueList.offer("R");
		queueList.offer("A");
		System.out.println(queueList);
		System.out.println(queueList.poll());
	}

}
