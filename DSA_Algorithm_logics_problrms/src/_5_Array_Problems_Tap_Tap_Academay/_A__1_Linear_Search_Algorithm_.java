package _5_Array_Problems_Tap_Tap_Academay;

public class _A__1_Linear_Search_Algorithm_ {

	public static int linearSearch(int[] a,int key)
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{ 
		int [] a= {10,20,30,509,78};
		int key=-10;
	   int index=linearSearch(a,key);
	   if(index!=-1)
		   System.out.println(key+" Found At "+index +" Position In Array");
	   else
		   System.out.println(key+" Not Found In Array");
	}
}
