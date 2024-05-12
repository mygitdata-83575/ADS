//7. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

package com.sunbeam;

public class Assignment1_7 
{

	public static void main(String[] args) 
	{
		int arr [] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		for(int i=0; i<arr.length; i++)
		{	
			int flag =0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j]) 
				{
					flag = 1;
				    break;
				}
			}
			if(flag == 0) 
			{
				System.out.println("first non-repeating element is : "+arr[i]);
				break;
			}
		}

	}

}
