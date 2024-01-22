package _5_Array_Problems_Tap_Tap_Academay;

public class _P_16_Minimum_Number_Of_days_Require_To_Make_Bouquets
{

	public static int minimumDays(int[] ar,int buq,int flower)
	{
		int l=ar[0];
		int h=ar[0];
		
//		if()
		
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]<l)
			{
				l=ar[i];
			}
			if(ar[i]>h)
			{
				h=ar[i];
			}
		}
		
		int res=-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(isPossibleSoln(ar,buq,flower,mid)==true)
			{
				res=mid;
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		return res;
		
	}
	
	
	
	private static boolean isPossibleSoln(int[] ar, int buq, int flower,int mid) {
		
		int adj=0;
		int bc=0;
		
	
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i] <=  mid)//	int [] a= {1,10,3,10,2};
			{
				adj++;
				if( adj == flower)
				{
					bc++;
					if( bc == buq)
					{
						return true;
					}
					adj=0;
				}
			}
			else
			{
				adj=0;
			}
		}
		return false;
		
	}



	public static void main(String[] args) {
		int [] a= {2,5,2,9,3,10,4,6,5,9};
		int m=4;
		int k=2;
		System.out.println(minimumDays(a, m, k));
	}
}

