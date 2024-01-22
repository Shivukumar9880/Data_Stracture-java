package _4_Recurssion_programs;

import java.util.Arrays;

public class _17_BinarySearch_Using_Recursion {

	public static int binarySearch(int[] a,int low,int high,int key)
	{
		int mid=(low+high)/2;//

		if(a[mid]==key)
		{
			return mid;
		}
		if(high<low)
		{
			return -1;
		}
		if(key<a[mid])
		{
			high=mid-1;
			return binarySearch(a,low,high,key);
		}
		else
		{
			low=mid+1;
			return binarySearch(a,low,high,key);
		}
	
	}
	public static void main(String[] args) 
	{
		int []a= {1,2,3,76,5,6,7,8,45,89};
		Arrays.sort(a);
		int key=76;
		System.out.println(binarySearch(a, 0, a.length-1, key));
		
		
	}
}
