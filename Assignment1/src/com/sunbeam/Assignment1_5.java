package com.sunbeam;

import java.util.Scanner;

//Implement binary search algorithm if array is sorted in descending order

public class Assignment1_5 {
	
    public static int binarySearch(int arr[], int N, int key) {
    	int left = 0, right = N-1, mid;
    	while(left<=right) {
    		mid = (left+right)/2;
    		if(key == arr[mid])
    			return mid;
    		else if(key < arr[mid])
    			left = mid+1;
    			
//    		(key > arr[mid])
    		else
    			right = mid-1;
    	}
    	return -1;
    }
    
   

	public static void main(String[] args) {
		
		int arr[] = {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched :");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
//		int index = binarySearch(arr, 0, arr.length-1,key);
		if(index != -1)
			System.out.println("key is found at index "+index);
		
		else
			System.out.println("key is not found");

	}

}

