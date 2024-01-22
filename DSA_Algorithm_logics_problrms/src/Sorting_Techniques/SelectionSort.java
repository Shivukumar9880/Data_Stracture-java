 package Sorting_Techniques;

import java.util.Arrays;

public class SelectionSort
{

	public static void main(String[] args) {
		
		int a[]= {55,89,64,9,43,24,19};
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[min])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
