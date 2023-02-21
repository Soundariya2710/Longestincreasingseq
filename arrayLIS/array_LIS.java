package com.simplilearn.arrayLIS;

public class array_LIS {

	public static void main(String[] args) {
		// Initialize an array and find its length
		
		int [] a = {7,11,8,3,55,62,33,77,99};
		
		int n= a.length;
		
	 System.out.println("The length of the longest increasing seq is :: " + arrayLIS_length(a,n));
	

	}

	
	public static int arrayLIS_length (int arr[], int n) {
		
		int  i,j, max = 0;
		
		
		//declaring an array with the same length as that of input array;
		int max_arr[] = new int[n];
		
		// initializing all the values in the array to be 1.
		
		for (i=0;i<n;i++)
		{
			max_arr[i]=1;
		}
		
		// finding the length of longest increasing seq
		
		for(i=1; i<n;i++)
		{
			for (j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && max_arr[i] < max_arr[j]+1)
				{
					max_arr[i]=max_arr[j]+1;
					
				}
			}
		}
		 // return the value of max 
		
		for ( i=0; i<n;i++)
		{
			if(max<max_arr[i])
			{
				max = max_arr[i];
				}
			
			}
		
		return max;
		
		
	}
	
	
}
