package _5_Array_Problems_Tap_Tap_Academay;

public class _E_5_Finding_Second_Largest_Element_In_The_Array {

	
	public static int  secondLargestEle(int [] a)
	{
		int first=0;
		int second=0;
		
		if(a[0]>a[1])
		{
			first=a[0];		
			second=a[1];
		}
		else
		{
			first=a[1];
			second=a[0];
		}
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>first)//	int a[]= {45,25,7,39,99}; 20>45
			{  second=first;
			   first=a[i];
			}
			else if(a[i]>second)
			{
				second=a[i];
			}
		}
		
		return second;
	}
	public static void main(String[] args) {
//		int a[]= {10,20,45,25,7,39,99};
		int a[]= {40,40};
		System.out.println(secondLargestEle(a));
	}
}

