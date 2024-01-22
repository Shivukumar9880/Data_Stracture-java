package _5_Array_Problems_Tap_Tap_Academay;

public class _O_15_Painter_Partituon_Problem {

	private static boolean isPossibleSolution(int[] ar, int a, int mid) 
	{
	    int painter=1;
	    int pbc=0;
	    for(int i=0; i<ar.length;i++)
	    {
	    	if(ar[i]>mid)
	    	{
	    		return false;
	    	}
	       if(ar[i]+pbc<=mid)
	       {
	    	   pbc=pbc+ar[i];
	       }
	       else
	       {
	    	   painter++;
	    	   if(painter>a)
	    	   {
	    		   return false; 
	    	   }
	    	   pbc=ar[i];
	       }
	    }
	    return true;
	}
	public static int maxTime(int[] ar,int a,int b)
	{
		int l=0; int h=0;
		for(int i=0; i<ar.length;i++)
		{
			h=h+ar[i];
		}
		int res=-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			
			if(isPossibleSolution(ar,a,mid))
			{
				res=mid;
				h=mid-1;
			}else
			{
				l=mid+1;
			}
			
		}
		return res*b;//to complete 60 unit of work require 120 units of time.......
	}
	


	public static void main(String[] args) {
		
		int [] ar= {10,20,30,40};
		int a=2;
		int b=2;
	    System.out.println(	maxTime(ar, a, b));
		
	}
}
