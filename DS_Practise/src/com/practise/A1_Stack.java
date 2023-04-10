package com.practise;

import java.util.Stack;

public class A1_Stack {

	public static void main(String[] args) {
	//	STACk  = LIFO datastructure. Last In First Out
	//			 Stores objects into a sort of vertical tower
	//			 push() to add element to the top
	//			 pop() to remove element from the top
	//			 peek() to return the top element without remove/delete from stack
	//			 other methods - empty(),search()
	
	//USES OF STACKS :
	//	1.undo/redo features in text editors
	//	2.moving back.forward in browser history
	//	3.backtracking algorithm(maze,file directories)
	//	4.calling functions(call stack)
	
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		stack.push("Java");
		stack.push("Spring");
		stack.push("Hibernate");
		stack.push("Oracle");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.empty());
		
		/*Exception in thread "main" java.lang.OutOfMemoryError: 
		Java heap space*/
		/*for(int i=0;i<=1000000000; i++) {
			stack.push("Microservice");
		}*/

	}

}
