package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_1 {
	public static void selectionSort(char arr[], int N) {
		for(int i=N-1; i>0; i--) {
			for(int j=i-1; j>-1; j--) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			
	}

//  1. Write all possibilites to check palindrome. Also do time and space complexity analysis
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str[] = sc.;
		
        char arr [] = {'s', 'u', 'n', 'b', 'e', 'a', 'm'};
		
//        int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Array before sort"+ Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Array after sort"+ Arrays.toString(arr));
		

		
		

	}

}
