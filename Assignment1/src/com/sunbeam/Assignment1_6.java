// Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
// not found, return -1

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_6 {
	
	public static int linearSearch(int arr[], int N, int key) {
		int count =0;
		for(int i=0; i<N; i++) {
			if(key == arr[i]) {
				count++;
				
				return i;
			}
			continue;
			
		}
		System.out.println("Count - "+ count);
		return -1;
	}

	public static void main(String[] args) {
		int arr [] = {88, 33, 66, 99, 11, 77, 66, 55, 14};
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a key");
//		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, 66);
		if(index != -1)
			System.out.println("key is found at index "+ index);
		    
		
		else
			System.out.println("key is not found");
			
//		sc.close();

	}

}
