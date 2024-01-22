package _5_Array_Problems_Tap_Tap_Academay;

public class _I_9_Find_First_And_Last_Position_Of_Element_In_Sorted_Array_LeetCode_34_Problem {

	
	public static int[] searchRange(int [] nums,int target)
	{
		int low=0; int high=nums.length-1; int mid=0;
		int res[]= {-1,-1};
		while(low<=high)
		{
			mid=(low+high)/2;
			if(target==nums[mid])
			{
				res[0]=mid;
				high=mid-1;
			}else if(target<nums[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
				
		}
		 low=0;  high=nums.length-1;  mid=0;
			while(low<=high)
			{
				mid=(low+high)/2;
				if(target==nums[mid])
				{
					res[1]=mid;
					low=mid+1;
				}else if(target<nums[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
					
			}
		return res;
	}
	public static void main(String[] args) {
		int a[]= {3,4,4,4,4,4,4,4,4,5,5,6};
		int target=5;
		int [] res=searchRange(a, target);
		System.out.println(res[0]+" "+res[1]);
	}
}
