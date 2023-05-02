package com.practise;

public class A06_LinearSearch {

	public static void main(String[] args) {
	
		// Linear Search - Iterated through a collection, one element at a time
		
		int[] arr = {9,8,1,7,6,5,4,3,2,0};
		int index = linearSearch(arr,1);
		if(index != -1) {
			System.out.println("Element Foudn At Index = " +index);
		}else {
			System.out.println("Element Not Found");
		}
	}

	private static int linearSearch(int[] arr, int val) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
