package _4_Recurssion_programs;

public class _18_Find_SubSetSum_Problem_using_recurssion {

	public static int countSunSet(int ar[],int sum,int i)
	{
		
		if(sum==0)
		{
			return 1;
		}
		if(sum<0)
		{
			return 0;
		}
		if(i==ar.length)
		{
			return 0;
		}
		return countSunSet(ar, sum-ar[i], i+1)+countSunSet(ar, sum, i+1);
	}
	public static void main(String[] args) {
		
		int[] a= {10,20,15,5};
		System.out.println(countSunSet(a, 25, 0));
	}
}
