package com.practise;

import java.util.Arrays;

public class A07_BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = new int[10000000];
		int target = 77777;
		
		for(int i =0;i< arr.length;i++) {
			arr[i] = i;
		}
		int index = Arrays.binarySearch(arr, target);
		if(index == -1) {
			System.out.println(target +"Not Found");
		}else {
			System.out.println("Element found at index : " +index);
		}
	}

}
