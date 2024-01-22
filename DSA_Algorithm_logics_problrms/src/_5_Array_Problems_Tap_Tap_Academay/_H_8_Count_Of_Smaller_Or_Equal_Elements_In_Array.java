package _5_Array_Problems_Tap_Tap_Academay;import java.util.zip.CheckedOutputStream;

public class _H_8_Count_Of_Smaller_Or_Equal_Elements_In_Array {
	/**
	 * count no of Elements are present in Array that less then or equal to Key Element In Sorted Array
	 * Basically we need check For 3 conditions
	 * 1.no Duplicates In Elements in Sorted Array
	 * 2.Duplicate Elements In Sorted Array
	 * 3.Key Element Does Not Exit In Array
	 */


	public static int countSmallAndEqualElements(int[] a,int key)
	{

		int low=0;
		int high=a.length-1;
		int mid=0;

		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				while(mid+1<a.length&&key==a[mid+1])
				{
					mid++;
				}
				break;
			}else if(key<a[mid])
			{
				high=mid-1;
			}
			else 
			{
				low=mid+1;
			}
		}
       if(a[mid]>key)
       {
    	   return mid;
       }
       else 
       {
    	   return mid+1;
       }
	}
	public static void main(String[] args) {
		
//		int a[]= {2,6,8,12,15,20,26,28,30};
		int a[]= {2,6,8,12,15,20,26,26,26,26,28,30};
//		int a[]=  {2,6,8,12,15,28,30};
		int key=26;
		System.out.println(countSmallAndEqualElements(a, key));
	}
}
