// 8. to find rank of an element in a stream of integers. rank: rank of a 
//given integer "x", in stream is "total
// no. of ele's less than or equal to x (including x).
// Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_8 {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 3, 4, 4, 1};
		int ele, count =0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the rank of element to be found : ");
		ele=sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<=ele)
			{
				count++;
			}
		}
		System.out.println("Rank of "+ele+" is : "+ count);
		
		
		sc.close();
	}

}
