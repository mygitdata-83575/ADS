package com.sunbeam;

import java.util.Scanner;

public class Assignment1_3 {
	
	public static int linearSearch(int arr[], int N, int key) {
		int comps = 0;
		for(int i=0; i<N; i++) {
			comps++;
			
			if(key == arr[i]) {
				System.out.println("No of comparisions : " + comps);
					return i;
			}
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		int arr [] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		
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

