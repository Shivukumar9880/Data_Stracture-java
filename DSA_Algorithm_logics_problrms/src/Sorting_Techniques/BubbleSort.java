 package Sorting_Techniques;

public class BubbleSort
{

	public static void main(String[] args) {
		
		int a[]= {2,3,5,21,3,38,3,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-1)-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int x=a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
