package com.practise;

public class A08_InterpolcationSearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,8,64,128,256,512,1024,2048};
		int index =interpolationSearch(arr,256);

	}

	private static int interpolationSearch(int[] arr, int value) {
	
		int high = arr.length-1;
		int low =0;
		while (value >=arr[low] && value <=arr[high] && low<=high) {
			int probe = low + (high-low)*(value-arr[low])/(arr[high]-arr[low]);
			System.out.println("probe :" +probe);
			if(arr[probe]==value) {
				return probe;
			}else if(arr[probe] < value) {
				low = probe + 1;
			}else {
				high = probe -1;
			}
		}
		return 0;
	}

}
