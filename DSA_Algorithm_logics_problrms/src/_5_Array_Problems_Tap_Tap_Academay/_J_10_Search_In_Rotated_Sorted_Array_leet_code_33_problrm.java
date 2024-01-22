package _5_Array_Problems_Tap_Tap_Academay;

public class _J_10_Search_In_Rotated_Sorted_Array_leet_code_33_problrm {

	public static int searchInSortedArray(int[] a,int target)
	{
		int low=0; int  high=a.length-1; int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(target==a[mid])
			{
				return mid;
			}else if(a[low]<a[mid])
			{
				if(target>=a[low]&& target<a[mid])
				{
					high=mid-1;
				}else
				{
					low=mid+1;
				}
			}
			else
			{
				if(target>a[mid]&& target<=a[mid])
				{
					low=mid+1;
				}else
				{
					high=mid+1;
				}
			}
		}
		return -1;
		
	}
	//we can also do this using another way
	//---------------------------------------------------------------way 2(like bitonic Sequence)
	
//	public static int findBitonic(int[] a)
//	{
//		int low=0; int high=a.length-1; int mid=0;
//		
//		while(low<=high)
//		{
//			mid=(low+high)/2;
//			if(a[mid]>a[mid-1]&& a[mid]>a[mid+1])
//			{
//				return mid;
//			}
//			else if(a[mid]>a[mid-1]&&a[mid]<a[mid+1])
//			{
//				low=mid;
//			}
//			else
//			{
//				high=mid;
//			}
//		}
//		return -1;
//	}
//	
//	public static int ascendingBinarySearch(int a[],int target,int range)
//	{
//		int low=0; int high=range; int mid=0;
//		while(low<=high)
//		{
//			mid=(low+high)/2;
//			if(target==a[mid])
//			{
//				return mid;
//			}
//			else if(target<a[mid])
//			{
//				high=mid-1;
//			}
//			else
//			{
//				low=mid+1;
//			}
//		}
//		return -1;
//	}
//
//	public static int ascendingBinarySearch1(int a[],int target,int range)
//	{
//		int low=range+1; int high=a.length-1; int mid=0;
//		while(low<=high)
//		{
//			mid=(low+high)/2;
//			if(target==a[mid])
//			{
//				return mid;
//			}
//			else if(target<a[mid])
//			{
//				high=mid-1;
//			}
//			else
//			{
//				low=mid+1;
//			}
//		}
//		return -1;
//	}
	
//	public static void search(int a[],int target)
//	{
//		int findBitonic = findBitonic(a);
//		System.out.println(findBitonic);
//		int leftSide = ascendingBinarySearch(a, target, findBitonic);
////		System.out.println(leftSide);
//		if(leftSide!=-1)
//		{
//		//System.out.println(leftSide);	
//		}
//		else
//		{
//			System.out.println(ascendingBinarySearch1(a, target, findBitonic));
//		}
//	}
	public static void main(String[] args) {
		
//		int[] a= {4,5};
		int [] a= {4,5,6,7,8,1,2};
		
		int target=2;
		System.out.println(searchInSortedArray(a, target));
//		System.out.println("----------------------------------"); 
//		search( a,target);
			
		
	}
}
