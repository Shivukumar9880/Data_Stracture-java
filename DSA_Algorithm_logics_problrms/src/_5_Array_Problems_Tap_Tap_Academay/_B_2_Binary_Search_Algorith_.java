package _5_Array_Problems_Tap_Tap_Academay;

public class _B_2_Binary_Search_Algorith_ 
{

	public static int binarySearch(int[] a,int key)
	{
		int low=0;
		int high=a.length-1; 
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<a[mid])
			{
				high=mid-1;
			}else
			{
				low=mid+1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		
		int [] a= {1,3,5,7,9,12,15,18,34,67};
		
		int key=13;
		System.out.println(binarySearch(a, key));
		
	}
}
