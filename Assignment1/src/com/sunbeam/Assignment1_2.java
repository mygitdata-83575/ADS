package com.sunbeam;

import java.util.Scanner;

public class Assignment1_2 {
//	 Write a linear search algorithm to return index of last occurance of key
	
	public static int linearSearch(int arr[], int N, int key) {
		for(int i=N-1; i>0; i--) {
			if(key == arr[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr [] = {88, 33, 66, 99, 11, 77, 22, 66, 14};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("key is found at index "+ index);
		
		else
			System.out.println("key is not found");
			
		sc.close();

	}

}
