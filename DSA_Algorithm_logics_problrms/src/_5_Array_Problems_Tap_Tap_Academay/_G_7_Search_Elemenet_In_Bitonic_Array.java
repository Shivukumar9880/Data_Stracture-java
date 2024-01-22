package _5_Array_Problems_Tap_Tap_Academay;

/**
 * Bitonic sequence means array sorted in ascending order till at one point after sorted in descending order this sequence is called Bitonic array
 * 
 *  that point array sorted in descding order that point we called as Bitonic point. that element we called as Bitonic Element.that index called Bitonic Index
 */
public class _G_7_Search_Elemenet_In_Bitonic_Array {


	public static int findbitonicPonint(int []a) 
	{
		int low=0;int high=a.length-1; int mid=0;

		while(low<=high)
		{
			mid=(low+high)/2;

			if(a[mid]>a[mid-1]&& a[mid]>a[mid+1])
			{
				return  mid;
			}
			else if(a[mid]>a[mid-1]&&a[mid]<a[mid+1])
			{
				low=mid;

			}else
			{
				high=mid;
			}
		}

		return -1;

	}
	public static int ascendingBinarySearch(int[] a,int key,int range)
	{
		int low=0; int high=range; int mid=0;

		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<=a[mid])
			{
				high=mid-1;
			}else
			{
				low=mid+1;
			}
		}
		return -1;
	}
	public static int descendingBinarySearch(int[] a,int key,int range)
	{
		int low=range; int high=a.length-1; int mid=0;

		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<=a[mid])
			{
				low=mid+1;
			}else
			{
				high=mid-1;
			}
		}
		return -1;
	}

	public static int searchBitonic(int []a,int key,int bIndex)
	{
		

		if(key==a[bIndex])
		{
			return bIndex;
		}
		if(key>a[bIndex])
		{
			return -1;
		}

		int res1=ascendingBinarySearch(a, key,bIndex);
		if(res1!=-1)
		{
			return res1;
		}

		int res2=descendingBinarySearch(a, key, bIndex);
		if(res2!=-1)
		{
			return res2;
		}

		return -1;

	}
	public static void main(String[] args) {


		int a[] ={2,4,6,9,15,18,19,20,10,5,4,3,1};

		int bIndex=findbitonicPonint(a);
		int key=6;
		System.out.println(searchBitonic(a, key, bIndex));
	}
}
