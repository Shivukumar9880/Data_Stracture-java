package _4_Recurssion_programs;

public class _16_LinerSearch_Using_Recurssion
{

	public static int linerSearch(int[] a,int i,int key)
	{
		if(i>=a.length)
		{
			return -1;
		}
		if(a[i]==key)
		{
			return i;
		}

		return linerSearch(a,i+1,key);
		
	}
	public static void main(String[] args) {
		int a[]= {10,30,45,67,55};
		System.out.println(linerSearch(a, 0, 30));
	}
}
