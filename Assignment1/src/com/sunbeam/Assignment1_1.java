package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_1 {
//	public static void selectionSort(char arr[], int N) {
//		for(int i=N-1; i>0; i--) {
//			for(int j=i-1; j>-1; j--) {
//				if(arr[i] < arr[j]) {
//					char temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//	}

//  1. Write all possibilites to check palindrome. Also do time and space complexity analysis
	
	public static void reverse(char arr[], int N) {
		int j=0;
		char arr1[]=new char[arr.length];
		for(int i=N-1; i>-1; i--) 
		{
			 arr1[j]=arr[i];
			j++;
		}
		
		
		if(Arrays.toString(arr1).equals(Arrays.toString(arr))) {
			System.out.println(" Entered String is in Palindrome");
	    }
		else
			System.out.println("Entered String is not in palindrome");
	
	}
	
	public static void main(String[] args) {
	
		char arr [] = {'b', 'a', 'd', 'a', 'r'};
			
		System.out.println("Array before reverse : "+ Arrays.toString(arr));
		reverse(arr,arr.length);
		System.out.println("Array after reverse : "+ Arrays.toString(arr));

		
		
		
		
			
		}

		
		

	}


