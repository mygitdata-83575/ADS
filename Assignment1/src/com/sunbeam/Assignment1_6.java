// Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
// not found, return -1

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_6 {
	
	public static int linearSearch(int arr[], int key, int occur) 
	{
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			if(key == arr[i]) 
			{
				count++;
				
				if(count == occur)
				{
					return i;
				}
			}
			
			
		}
//		System.out.println("Count - "+ count);
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr [] = {88, 33, 66, 99, 66, 77, 66, 55, 77};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to be searched");
		int key = sc.nextInt();
		System.out.println("Enter a occurance no");
		int occur = sc.nextInt();
		
		
		int index = linearSearch(arr, key, occur);
		if(index != -1)
			 System.out.println(occur+"th occurrence is at index :"+index);
		    
		
		else
			System.out.println("element is not found");
			
		sc.close();

	}

}
