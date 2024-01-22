package _5_Array_Problems_Tap_Tap_Academay;

public class _M_Midean_Of_Two_Sorted_Array_With_O_log_m_n_Time_COmplexity {

	public static float medianTwoSortedArrya(int []ar1,int[] ar2)
	{
		if(ar2.length <  ar1.length)
		{
			return medianTwoSortedArrya(ar2,ar1);
		}
		
		int l = 0; int h = ar1.length;
		
		while(l<=h)
		{
			int m1=(l+h)/2;
			
			int m2=(( ar1.length + ar2.length + 1  )/2)-m1;
			
			int l1=(m1==0) ? Integer.MIN_VALUE  :  ar1[m1-1];
			int r1=(m1==ar1.length) ?  Integer.MAX_VALUE : ar1[m1];
			int l2=(m2==0) ? Integer.MIN_VALUE :  ar2[m2-1];
			int r2=(m2==ar2.length) ?  Integer.MAX_VALUE: ar2[m2];
			
			if(l1<=r2 &&l2<=r1 ) 
			{
				if((ar1.length+ar2.length)%2==0)
				{
					 return (float)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;
					
				}else
				{
					return (float)Integer.max(l1,l2);
				}
			}else if(l2>r1)
			{ 
				l=m1+1;
				
			}else
			{
				h=m1-1;
			}
			
		}
		return 0.0f;
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {1,3,8,17};
		int b[]= {5,6,7,19,21,25,35};//1,3,5,7,8,17,19,21,25
		System.out.println(medianTwoSortedArrya(a, b));
		
	}
}
