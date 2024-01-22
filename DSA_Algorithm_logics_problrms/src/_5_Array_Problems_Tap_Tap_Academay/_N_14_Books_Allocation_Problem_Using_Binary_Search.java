package _5_Array_Problems_Tap_Tap_Academay;

public class _N_14_Books_Allocation_Problem_Using_Binary_Search 
{

	private static boolean isPossibleSolution(int[] ar,int b, int mid) {

		int student=1;
		int spc=0;//student page count
		
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]>mid)
			{
				return false;
			}
			if(spc+ar[i]<=mid)
			{
				spc=spc+ar[i];
			}else
			{
				student++;
				if(student>b)
				{
					return false;
				}
				spc=ar[i];	
			}

		}
		return true;
	}

	private static int findMaxPagees(int[] ar, int b) {


		int l=ar[0];
		int h=0;
		int mid=0;
		for(int i=0;i<ar.length;i++)
		{

			if(ar[i]<l)
			{
				l=ar[i];
			}
			h=h+ar[i];
		}

		int res=-1;
		while(l<=h)
		{
			mid=(l+h)/2;

			if(isPossibleSolution(ar,b,mid))
			{
				res = mid;
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		return res;

	}
	public static void main(String[] args) 
	{

		int a[] = {12,34,67,90};
		int b=2;
		System.out.println((findMaxPagees(a,b)));
	}
}
