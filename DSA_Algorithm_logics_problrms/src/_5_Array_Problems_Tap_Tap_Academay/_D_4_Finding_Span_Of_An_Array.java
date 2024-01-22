package _5_Array_Problems_Tap_Tap_Academay;

/**
 * span of an array means find max element in array and find minimum element in array
 * Subtract max-min value Then we will get Span Of AN Array.........
 */
public class _D_4_Finding_Span_Of_An_Array {

	
	public static int spanOfAnArray(int [] a)
	{
		int min=a[0];
		int max=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}

		return max-min;
	}
	
	public static void main(String[] args) {
		
		int a[]= {10,1,5,78,3,9,4,100,7,5,8};
		
		System.out.println("Span of an Array is :"+spanOfAnArray(a));
	}
}
